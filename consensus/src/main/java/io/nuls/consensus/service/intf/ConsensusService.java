package io.nuls.consensus.service.intf;

import io.nuls.consensus.entity.Consensus;
import io.nuls.consensus.entity.ConsensusStatusInfo;
import io.nuls.core.chain.entity.Na;
import io.nuls.core.chain.entity.NulsDigestData;
import io.nuls.core.chain.entity.Transaction;
import sun.management.Agent;

import java.util.List;
import java.util.Map;

/**
 * @author Niels
 * @date 2017/11/7
 */
public interface ConsensusService {

    Na getTxFee(int txType);

    void joinTheConsensus(String address, String password, Map<String, Object> paramsMap);

    void exitTheConsensus(NulsDigestData joinTxHash, String password);

    List<Consensus> getConsensusAccountList(String address, String agentAddress);

    ConsensusStatusInfo getConsensusInfo(String address);

}