/*
 * Copyright (c) 2008-2009 Tomas Varaneckas
 * http://www.varaneckas.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.gmail4j;

import java.util.Date;
import java.util.List;

/**
 * Gmail message interface. 
 * <p>
 * Implementations that do not provide some functionality (i.e. 
 * {@link #getContentText()}) throw {@link UnsupportedOperationException}
 * for those methods by default. 
 * <p>
 * Example: Print unread messages:
 * <p><blockquote><pre>
 *     GmailClient client = //...instantate
 *     //configure the client...
 *     for (GmailMessage message : client.getUnreadMessages()) {
 *         System.out.println(message.getFrom());
 *         System.out.println(message.getDate());
 *         System.out.println(message.getTitle());
 *         System.out.println(message.getPreview());
 *         System.out.println(message.getLink());
 *         System.out.println(message.getContentText());
 *     }
 * </pre></blockquote><p>
 * Example: Send a simple message:
 * <p><blockquote><pre>
 *     GmailClient client = //...instantate
 *     //configure the client...
 *     GmailMessage message = //new GmailMessage instance
 *     message.setSubject("Subject");
 *     message.setContentText("Content");
 *     message.addTo(new EmailAddress("j.smith@example.com");
 *     client.send(message);
 * </pre></blockquote></p>
 * 
 * @see GmailMessage
 * @author Tomas Varaneckas &lt;tomas.varaneckas@gmail.com&gt;
 * @version $Id$
 * @since 0.1
 */
public abstract class GmailMessage {

    /**
     * Gets Gmail message subject
     * 
     * @return Message subject
     */
    public abstract String getSubject();

    /**
     * Sets message subject
     * 
     * @param subject Subject to be set
     * @throws UnsupportedOperationException if implementation does not provide
     *         this feature.
     */
    public void setSubject(final String subject) {
        throw new UnsupportedOperationException("This GmailMessage " +
        		"implementation does not support setSubject()");
    }
    
    /**
     * Gets the {@link Date} this message was sent
     * 
     * @return Send date
     */
    public abstract Date getSendDate();

    /**
     * Gets the sender {@link EmailAddress}
     * 
     * @return Sender email address
     */
    public abstract EmailAddress getFrom();
    
    /**
     * Sets message sender's {@link EmailAddress}
     * 
     * @param from Sender's email address
     * @throws UnsupportedOperationException if implementation does not provide
     *         this feature.
     */
    public void setFrom(final EmailAddress from) {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not support setFrom()");
    }   
    
    /**
     * Gets a list of message "To:" recipient {@link EmailAddress}<code>es</code>
     * 
     * @return list of message "To:" recipient email addresses
     * @throws UnsupportedOperationException if implementation does not provide
     *         this functionality
     */
    public List<EmailAddress> getTo() {
        throw new UnsupportedOperationException("This GmailMessage " +
        		"implementation does not support getTo()");
    }
    
    /**
     * Gets a list of message "Cc:" recipient {@link EmailAddress}<code>es</code>
     * 
     * @return list of message "Cc:" recipient email addresses
     * @throws UnsupportedOperationException if implementation does not provide
     *         this functionality
     */    
    public List<EmailAddress> getCc() {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not provide getCc()");
    }
    
    /**
     * Adds carbon copy message recipient's {@link EmailAddress}
     * 
     * @param cc Carbon copy recipient's email address
     * @throws UnsupportedOperationException if implementation does not provide
     *         this feature.
     */
    public void addCc(final EmailAddress cc) {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not support addCc()");
    }    
    
    /**
     * Adds blind carbon copy message recipient's {@link EmailAddress}
     * 
     * @param bcc Blind carbon copy recipient's email address
     * @throws UnsupportedOperationException if implementation does not provide
     *         this feature.
     */
    public void addBcc(final EmailAddress bcc) {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not support addBcc()");
    }    
    
    /**
     * Adds message recipient's {@link EmailAddress}
     * 
     * @param to Recipient's email address
     * @throws UnsupportedOperationException if implementation does not provide
     *         this feature.
     */
    public void addTo(final EmailAddress to) {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not support addTo()");
    }       

    /**
     * Gets a direct link to this Gmail message
     * 
     * @return Web link to this message
     * @throws UnsupportedOperationException if implementation does not provide
     *         this functionality
     */
    public String getLink() {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not provide getLink()");
    }

    /**
     * Gets a content text preview for this message
     * 
     * @return Text preview for this message
     * @throws UnsupportedOperationException if implementation does not provide
     *         this functionality
     */    
    public String getPreview() {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not provide getPreview()");
    }
    
    /**
     * Gets content text for this message
     * 
     * @return Text content for this message
     * @throws UnsupportedOperationException if implementation does not provide
     *         this functionality
     */        
    public String getContentText() {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not provide getContentText()");
    }
    
    /**
     * Sets content text for this message
     * 
     * @return Text content for this message
     * @throws UnsupportedOperationException if implementation does not provide
     *         this functionality
     */            
    public void setContentText(final String contentText) {
        throw new UnsupportedOperationException("This GmailMessage " +
                "implementation does not provide setContentText()");
    }

}