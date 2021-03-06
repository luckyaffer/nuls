package io.nuls.event.bus.bus.service.intf;

import io.nuls.core.event.BaseNulsEvent;

import java.util.List;

/**
 * @author Niels
 * @date 2017/12/8
 */
public interface EventBroadcaster {

    /**
     * broadcast a message that need to be passed
     *
     * @param event
     * @return
     */
    List<String> broadcastHashAndCache(BaseNulsEvent event);


    List<String> broadcastHashAndCache(BaseNulsEvent event, String excludePeerId);

    /**
     * broadcast to peers except "excludePeerId"
     * @param event
     * @param excludePeerId
     * @return
     */
    List<String> broadcastAndCache(BaseNulsEvent event, String excludePeerId);

    /**
     * broadcast msg ,no need to pass the message
     * @param event
     */
    List<String> broadcastAndCache(BaseNulsEvent event);

    /**
     * send msg to one peer
     * @param event
     * @param peerId
     */
    boolean sendToPeer(BaseNulsEvent event, String peerId);

}
