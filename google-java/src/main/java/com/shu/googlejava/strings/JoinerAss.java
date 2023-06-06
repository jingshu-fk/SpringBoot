package com.shu.googlejava.strings;

import com.google.common.base.Joiner;
import java.util.List;

/**
 * JoinerAss
 * @description fgs
 * @author shujingping
 * @date 2023/3/6 10:47
 * @version 1.0
 */
public class JoinerAss {

    public String joninerTest(List<String> message) {
        Joiner joiner = Joiner.on(";").skipNulls();
        return joiner.join(message);
    }


}
 
