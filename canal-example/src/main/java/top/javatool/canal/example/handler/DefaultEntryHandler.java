package top.javatool.canal.example.handler;



import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.context.CanalContext;
import top.javatool.canal.client.handler.EntryHandler;
import top.javatool.canal.example.model.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 获取到map 对象后转换成sql，使用jooq执行 sql
 */
@CanalTable(value = "test")
@Component
public class DefaultEntryHandler implements EntryHandler<User> {


//    @Resource
//    private DSLContext dsl;


    private Logger logger = LoggerFactory.getLogger(DefaultEntryHandler.class);


    @Override
    public void insert(User map) {
        logger.info("增加 {}", map);
        String table = CanalContext.getModel().getTable();
//        List<Field<Object>> fields = map.keySet().stream().map(DSL::field).collect(Collectors.toList());
//        List<Param<String>> values = map.values().stream().map(DSL::value).collect(Collectors.toList());
//        int execute = dsl.insertInto(table(table)).columns(fields).values(values).execute();
//        logger.info("执行结果 {}", execute);
    }

//    @Override
//    public void update(Map<String, String> before, Map<String, String> after) {
//        logger.info("修改 before {}", before);
//        logger.info("修改 after {}", after);
//        String table = CanalContext.getModel().getTable();
//        Map<Field<Object>, String> map = after.entrySet().stream().filter(entry -> before.get(entry.getKey()) != null)
//                .collect(Collectors.toMap(entry -> field(entry.getKey()), Map.Entry::getValue));
//        dsl.update(table(table)).set(map).where(field("id").eq(after.get("id"))).execute();
//    }
//
//    @Override
//    public void delete(Map<String, String> map) {
//        logger.info("删除 {}", map);
//        String table = CanalContext.getModel().getTable();
//        dsl.delete(table(table)).where(field("id").eq(map.get("id"))).execute();
//    }
}
