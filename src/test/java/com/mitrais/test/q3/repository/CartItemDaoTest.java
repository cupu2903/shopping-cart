package com.mitrais.test.q3.repository;

import com.mitrais.test.q3.repository.dao.*;
import com.mitrais.test.q3.repository.domain.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * @author Achmad Yusuf Ramadhan cupu2903@gmail.com
 * @version 1.0
 * @since 20/09/2019
 */

@RunWith(SpringRunner.class)
@DataJpaTest
public class CartItemDaoTest {

    @Autowired
    CartItemDao cartItemDao;

    public void printAllItemInCart() {
        String cartId = "abcd";
        List<CartItem> allItemInCart = cartItemDao.findAllItemInCart(cartId);

        assertThat(allItemInCart).hasSize(2);
    }
}
