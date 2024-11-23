package top.javatool.canal.client.handler;

import com.alibaba.otter.canal.protocol.CanalEntry;

public interface RowDataHandler<T> {


    <R> void handlerRowData(T t, EntryHandler<R> entryHandler, CanalEntry.EventType eventType) throws Exception;
}
