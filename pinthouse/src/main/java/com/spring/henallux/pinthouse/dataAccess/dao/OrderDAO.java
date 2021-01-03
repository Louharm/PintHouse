package com.spring.henallux.pinthouse.dataAccess.dao;

import com.spring.henallux.pinthouse.dataAccess.entity.CommandLineEntity;
import com.spring.henallux.pinthouse.dataAccess.entity.OrderEntity;
import com.spring.henallux.pinthouse.dataAccess.repository.CommandLineRepository;
import com.spring.henallux.pinthouse.dataAccess.repository.OrderRepository;
import com.spring.henallux.pinthouse.dataAccess.util.ProviderConverter;
import com.spring.henallux.pinthouse.model.CommandLine;
import com.spring.henallux.pinthouse.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional
public class OrderDAO implements OrderDataAccess{
    private ProviderConverter converter;
    private OrderRepository orderRepository;
    private CommandLineRepository commandLineRepository;

    @Autowired
    public OrderDAO(ProviderConverter converter, OrderRepository orderRepository, CommandLineRepository commandLineRepository){
        this.converter = converter;
        this.orderRepository = orderRepository;
        this.commandLineRepository = commandLineRepository;
    }

    @Override
    public void save(Order order) {
        OrderEntity orderEntity = converter.orderModelToOrderEntity(order);
        orderRepository.save(orderEntity);
        saveCommandLine(order.getCommandLines(), orderEntity.getId());
    }
    private void saveCommandLine(ArrayList<CommandLine> commandLines, Integer orderId){
        CommandLineEntity commandLineEntity;
        for (CommandLine commandLine: commandLines) {
            commandLineEntity = converter.commandLineModelToEntity(commandLine, orderId);
            commandLineRepository.save(commandLineEntity);
        }
    }
}
