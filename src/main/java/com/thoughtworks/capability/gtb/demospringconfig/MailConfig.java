package com.thoughtworks.capability.gtb.demospringconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("mail")
public class MailConfig {

    private String hostname;
    private int port;
    private String from;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", from='" + from + '\'' +
                ", defaultRecipients[0]='" + defaultRecipients.get(0)+'\'' +
                ", defaultRecipients[1]='" + defaultRecipients.get(1)+'\'' +
                ", additionalHeaders.redelivery="+ additionalHeaders.get("redelivery")+
                ", additionalHeaders.secure="+ additionalHeaders.get("secure")+"\n" +
                ", credentials.username='"+credentials.getUsername()+'\''+
                ", credentials.password='"+credentials.getPassword()+'\''+
                ", credentials.authMethod='"+credentials.getAuthMethod()+"\'}";
    }
}
