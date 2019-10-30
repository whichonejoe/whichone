package com.sidc.blackcore.thirdparty.api.asus.speaker.request;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sidc.blackcore.thirdparty.api.asus.speaker.bean.ASUSSpeakerBeliefBean;

public class ASUSSpeakerCommandRequest implements java.io.Serializable {
	private static final long serialVersionUID = 6542756787769957507L;
	private String grammarSentence;
	private ASUSSpeakerBeliefBean beliefs;
	private String Device;
	private String Domain;
	private String Location;
	private String originalSentence;
	private List<String> output_context;
	private List<String> Phrase;
	private String launch_activity;
	private String version;
	private String IntentionId;
	private boolean askBackResponse;
	private String output_text;
	private String SwitchTo;
	private boolean continuousSpeech;
	private boolean foregroundSluMode;
	private String domain;
	private boolean CrossIntent;
	private boolean voconLearnFlag;
	@SerializedName("TV.Number")
	@Expose
	private String TVNumber;
	private String correctedSentence;
	private String ask_back_status;
	private String input_context;

	public String getGrammarSentence() {
		return grammarSentence;
	}

	public ASUSSpeakerBeliefBean getBeliefs() {
		return beliefs;
	}

	public String getDevice() {
		return Device;
	}

	public String getDomain() {
		return Domain;
	}

	public String getLocation() {
		return Location;
	}

	public String getOriginalSentence() {
		return originalSentence;
	}

	public List<String> getOutput_context() {
		return output_context;
	}

	public List<String> getPhrase() {
		return Phrase;
	}

	public String getLaunch_activity() {
		return launch_activity;
	}

	public String getVersion() {
		return version;
	}

	public String getIntentionId() {
		return IntentionId;
	}

	public boolean isAskBackResponse() {
		return askBackResponse;
	}

	public String getOutput_text() {
		return output_text;
	}

	public String getSwitchTo() {
		return SwitchTo;
	}

	public boolean isContinuousSpeech() {
		return continuousSpeech;
	}

	public boolean isForegroundSluMode() {
		return foregroundSluMode;
	}

	public String getDOmain() {
		return domain;
	}

	public boolean isCrossIntent() {
		return CrossIntent;
	}

	public boolean isVoconLearnFlag() {
		return voconLearnFlag;
	}

	public String getTVNumber() {
		return TVNumber;
	}

	public String getCorrectedSentence() {
		return correctedSentence;
	}

	public String getAsk_back_status() {
		return ask_back_status;
	}

	public String getInput_context() {
		return input_context;
	}

	public ASUSSpeakerCommandRequest(String grammarSentence, ASUSSpeakerBeliefBean beliefs, String device,
			String domain, String location, String originalSentence, List<String> output_context, List<String> phrase,
			String launch_activity, String version, String intentionId, boolean askBackResponse, String output_text,
			String switchTo, boolean continuousSpeech, boolean foregroundSluMode, String domain2, boolean crossIntent,
			boolean voconLearnFlag, String tVNumber, String correctedSentence, String ask_back_status,
			String input_context) {
		super();
		this.grammarSentence = grammarSentence;
		this.beliefs = beliefs;
		Device = device;
		Domain = domain;
		Location = location;
		this.originalSentence = originalSentence;
		this.output_context = output_context;
		Phrase = phrase;
		this.launch_activity = launch_activity;
		this.version = version;
		IntentionId = intentionId;
		this.askBackResponse = askBackResponse;
		this.output_text = output_text;
		SwitchTo = switchTo;
		this.continuousSpeech = continuousSpeech;
		this.foregroundSluMode = foregroundSluMode;
		domain = domain2;
		CrossIntent = crossIntent;
		this.voconLearnFlag = voconLearnFlag;
		TVNumber = tVNumber;
		this.correctedSentence = correctedSentence;
		this.ask_back_status = ask_back_status;
		this.input_context = input_context;
	}

}
