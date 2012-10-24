
package com.veken0m.miningpools.deepbit;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.json.JSONObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DeepBitData{
	
   	private Number confirmed_reward;
   	private Number hashrate;
   	@JsonIgnore private boolean ipa;
   	private Number payout_history;
   	private Workers workers;

   	public DeepBitData(@JsonProperty("confirmed_reward") Number confirmed_reward, @JsonProperty("hashrate") Number hashrate, @JsonProperty("payout_history") Number payout_history, @JsonProperty("workers") Workers workers) {
   	   	this.confirmed_reward = confirmed_reward;
   	   	this.hashrate = hashrate;
   	   	this.payout_history = payout_history;
   	   	this.workers = workers;
   	  }
   	
 	public Number getConfirmed_reward(){
		return this.confirmed_reward;
	}
 	public Number getHashrate(){
		return this.hashrate;
	}
 	public boolean getIpa(){
		return this.ipa;
	}
 	public Number getPayout_history(){
		return this.payout_history;
	}
 	public Workers getWorkers(){
		return this.workers;
 	}
}
