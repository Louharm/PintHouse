package com.spring.henallux.pinthouse;

import com.spring.henallux.pinthouse.dataAccess.dao.BeerDAO;
import com.spring.henallux.pinthouse.dataAccess.entity.*;
import com.spring.henallux.pinthouse.dataAccess.repository.*;

import static org.assertj.core.api.Assertions.assertThat;

import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.Beer;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PinthouseApplicationTests {
	private BeerDAO beerDAO;

	@Mock
	private BeerRepository beerRepository;

	@Before
	public void setUp() throws Exception{

		beerDAO = new BeerDAO(new ProviderConverter(), beerRepository,null,null,null,null);
	}

	@Test
	public void findBeers(){
		int nbBeers = 17;
		ArrayList<BeerEntity> beers = new ArrayList<>();
		for(int i = 0; i < nbBeers; i++){
			beers.add(new BeerEntity());
		}
		when(beerRepository.findAll()).thenReturn(beers);
		ArrayList<Beer> beerArrayList = beerDAO.getAllBeerForTest();
		assertThat(beerArrayList.size()).isEqualTo(nbBeers);
	}
	@Test
	public void beerFind(){
		when(beerRepository.getByName("DUVEL bière blonde")).thenReturn(new BeerEntity());
		Beer beer = beerDAO.getBeerForTest("DUVEL bière blonde");
		assertThat(beer).isNotNull();
	}
	@Test
	public void correctPrice(){
		BeerEntity beerEntity = new BeerEntity("JUPILER",null,5.2,25.,0.5,1,3,6,1);
		when(beerRepository.getByName("JUPILER")).thenReturn(beerEntity);
		Beer beer = beerDAO.getBeerForTest("JUPILER");
		assertThat(beer.getPrice()*3).isEqualTo(1.5);
	}
}
