/**
 *
 */
package software.amazon.serverless.apprepo.api.client.model;

import com.amazonaws.protocol.ProtocolMarshaller;
import com.amazonaws.protocol.StructuredPojo;

import java.io.Serializable;
import javax.annotation.Generated;

import software.amazon.serverless.apprepo.api.client.model.transform.ApplicationListMarshaller;

/**
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xxx-2019-10-13/ApplicationList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationList implements Serializable, Cloneable, StructuredPojo {
  private String clientId;
  private List<String> therapists;
  private List<String> emotionRecords;
  private List<String> appointmentRequests;
  private List<String> messages;
  
  
  // Client methods
  public void setClientId(String clientId) {
      this.clientId = clientId;
  }
  public String getClientId() {
      return clientId;
  }
  public List<String> getTherapists() {
      return therapists;
  }
  public void setTherapists(List<String> therapists) {
      this.therapists = therapists;
  }

  public void addTherapist(String therapistId) {
      therapists.add(therapistId);
  }

  public void removeTherapist(String therapistId) {
      therapists.remove(therapistId);
  }

  public List<String> getEmotionRecords() {
      return emotionRecords;
  }
  public void setEmotionRecords(List<String> emotionRecords) {
      this.emotionRecords = emotionRecords;
  }

  public void addEmotionRecord(String emotionRecord) {
      emotionRecords.add(emotionRecord);
  }

  public List<String> getAppointmentRequests() {
      return appointmentRequests;
  }

  public void setAppointmentRequests(List<String> appointmentRequests) {
      this.appointmentRequests = appointmentRequests;
  }

  public void addAppointmentRequest(String appointmentRequest) {
      appointmentRequests.add(appointmentRequest);
  }

  public List<String> getMessages() {
      return messages;
  }

  public void setMessages(List<String> messages) {
      this.messages = messages;
  }

  public void sendMessage(String message) {
      messages.add(message);
  }
  
  // Therapist methods
  public void requestClientMapping(String clientId) {
      // Send a request to associate the client with this therapist
  }

  public void requestJournalAccess(String clientId) {
      // Send a request to access the client's emotions journal
  }

  public void removeClient(String clientId) {
      // Remove the client from the therapist's list of clients
  }

  public List<String> getClientJournals(String clientId) {
      // Retrieve and return the client's emotions journals associated with this therapist
  }

  public void modifySessionDetails(String sessionId, String privateNotes, String sharedNotes) {
      // Modify the details of the therapy session, including private and shared notes
  }

  public List<String> searchKeywords(String keyword) {
      // Search across customers, notes, and emotions journals for the specified keyword
  }
  
  private java.util.List<ApplicationSummary> applications;

  private String nextToken;

  /**
   * @return
   */

  public java.util.List<ApplicationSummary> getApplications() {
    return applications;
  }

  /**
   * @param applications
   */

  public void setApplications(java.util.Collection<ApplicationSummary> applications) {
    if (applications == null) {
      this.applications = null;
      return;
    }

    this.applications = new java.util.ArrayList<ApplicationSummary>(applications);
  }

  /**
   * <p>
   * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
   * {@link #setApplications(java.util.Collection)} or {@link #withApplications(java.util.Collection)} if you want to
   * override the existing values.
   * </p>
   *
   * @param applications
   * @return Returns a reference to this object so that method calls can be chained together.
   */

  public ApplicationList applications(ApplicationSummary... applications) {
    if (this.applications == null) {
      setApplications(new java.util.ArrayList<ApplicationSummary>(applications.length));
    }
    for (ApplicationSummary ele : applications) {
      this.applications.add(ele);
    }
    return this;
  }

  /**
   * @param applications
   * @return Returns a reference to this object so that method calls can be chained together.
   */

  public ApplicationList applications(java.util.Collection<ApplicationSummary> applications) {
    setApplications(applications);
    return this;
  }

  /**
   * @param nextToken
   */

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  /**
   * @return
   */

  public String getNextToken() {
    return this.nextToken;
  }

  /**
   * @param nextToken
   * @return Returns a reference to this object so that method calls can be chained together.
   */

  public ApplicationList nextToken(String nextToken) {
    setNextToken(nextToken);
    return this;
  }

  /**
   * Returns a string representation of this object; useful for testing and debugging.
   *
   * @return A string representation of this object.
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (getApplications() != null)
      sb.append("Applications: ").append(getApplications()).append(",");
    if (getNextToken() != null)
      sb.append("NextToken: ").append(getNextToken());
    sb.append("}");
    return sb.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;

    if (obj instanceof ApplicationList == false)
      return false;
    ApplicationList other = (ApplicationList) obj;
    if (other.getApplications() == null ^ this.getApplications() == null)
      return false;
    if (other.getApplications() != null && other.getApplications().equals(this.getApplications()) == false)
      return false;
    if (other.getNextToken() == null ^ this.getNextToken() == null)
      return false;
    if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
      return false;
    return true;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int hashCode = 1;

    hashCode = prime * hashCode + ((getApplications() == null) ? 0 : getApplications().hashCode());
    hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
    return hashCode;
  }

  @Override
  public ApplicationList clone() {
    try {
      return (ApplicationList) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
    }
  }

  @com.amazonaws.annotation.SdkInternalApi
  @Override
  public void marshall(ProtocolMarshaller protocolMarshaller) {
    ApplicationListMarshaller.getInstance().marshall(this, protocolMarshaller);
  }
}
