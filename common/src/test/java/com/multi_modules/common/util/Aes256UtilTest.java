package com.multi_modules.common.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aes256UtilTest {

    @Test
    void encrypt(){
        String encrypt = Aes256Util.encrypt("Hello");
        Assertions.assertThat(Aes256Util.decrypt(encrypt)).isEqualTo(encrypt);
    }

}