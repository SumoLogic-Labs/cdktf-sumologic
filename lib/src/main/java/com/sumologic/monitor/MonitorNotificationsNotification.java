package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.116Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorNotificationsNotification")
@software.amazon.jsii.Jsii.Proxy(MonitorNotificationsNotification.Jsii$Proxy.class)
public interface MonitorNotificationsNotification extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#action_type Monitor#action_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getActionType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#connection_id Monitor#connection_id}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionId() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#connection_type Monitor#connection_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getConnectionType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#message_body Monitor#message_body}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMessageBody() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#payload_override Monitor#payload_override}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPayloadOverride() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#recipients Monitor#recipients}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getRecipients() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution_payload_override Monitor#resolution_payload_override}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResolutionPayloadOverride() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#subject Monitor#subject}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubject() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_zone Monitor#time_zone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimeZone() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorNotificationsNotification}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorNotificationsNotification}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorNotificationsNotification> {
        java.lang.String actionType;
        java.lang.String connectionId;
        java.lang.String connectionType;
        java.lang.String messageBody;
        java.lang.String payloadOverride;
        java.util.List<java.lang.String> recipients;
        java.lang.String resolutionPayloadOverride;
        java.lang.String subject;
        java.lang.String timeZone;

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getActionType}
         * @param actionType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#action_type Monitor#action_type}.
         * @return {@code this}
         */
        public Builder actionType(java.lang.String actionType) {
            this.actionType = actionType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getConnectionId}
         * @param connectionId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#connection_id Monitor#connection_id}.
         * @return {@code this}
         */
        public Builder connectionId(java.lang.String connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getConnectionType}
         * @param connectionType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#connection_type Monitor#connection_type}.
         * @return {@code this}
         */
        public Builder connectionType(java.lang.String connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getMessageBody}
         * @param messageBody Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#message_body Monitor#message_body}.
         * @return {@code this}
         */
        public Builder messageBody(java.lang.String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getPayloadOverride}
         * @param payloadOverride Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#payload_override Monitor#payload_override}.
         * @return {@code this}
         */
        public Builder payloadOverride(java.lang.String payloadOverride) {
            this.payloadOverride = payloadOverride;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getRecipients}
         * @param recipients Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#recipients Monitor#recipients}.
         * @return {@code this}
         */
        public Builder recipients(java.util.List<java.lang.String> recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getResolutionPayloadOverride}
         * @param resolutionPayloadOverride Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution_payload_override Monitor#resolution_payload_override}.
         * @return {@code this}
         */
        public Builder resolutionPayloadOverride(java.lang.String resolutionPayloadOverride) {
            this.resolutionPayloadOverride = resolutionPayloadOverride;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getSubject}
         * @param subject Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#subject Monitor#subject}.
         * @return {@code this}
         */
        public Builder subject(java.lang.String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Sets the value of {@link MonitorNotificationsNotification#getTimeZone}
         * @param timeZone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_zone Monitor#time_zone}.
         * @return {@code this}
         */
        public Builder timeZone(java.lang.String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorNotificationsNotification}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorNotificationsNotification build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorNotificationsNotification}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorNotificationsNotification {
        private final java.lang.String actionType;
        private final java.lang.String connectionId;
        private final java.lang.String connectionType;
        private final java.lang.String messageBody;
        private final java.lang.String payloadOverride;
        private final java.util.List<java.lang.String> recipients;
        private final java.lang.String resolutionPayloadOverride;
        private final java.lang.String subject;
        private final java.lang.String timeZone;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.actionType = software.amazon.jsii.Kernel.get(this, "actionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionId = software.amazon.jsii.Kernel.get(this, "connectionId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.connectionType = software.amazon.jsii.Kernel.get(this, "connectionType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.messageBody = software.amazon.jsii.Kernel.get(this, "messageBody", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.payloadOverride = software.amazon.jsii.Kernel.get(this, "payloadOverride", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.recipients = software.amazon.jsii.Kernel.get(this, "recipients", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.resolutionPayloadOverride = software.amazon.jsii.Kernel.get(this, "resolutionPayloadOverride", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.subject = software.amazon.jsii.Kernel.get(this, "subject", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeZone = software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.actionType = builder.actionType;
            this.connectionId = builder.connectionId;
            this.connectionType = builder.connectionType;
            this.messageBody = builder.messageBody;
            this.payloadOverride = builder.payloadOverride;
            this.recipients = builder.recipients;
            this.resolutionPayloadOverride = builder.resolutionPayloadOverride;
            this.subject = builder.subject;
            this.timeZone = builder.timeZone;
        }

        @Override
        public final java.lang.String getActionType() {
            return this.actionType;
        }

        @Override
        public final java.lang.String getConnectionId() {
            return this.connectionId;
        }

        @Override
        public final java.lang.String getConnectionType() {
            return this.connectionType;
        }

        @Override
        public final java.lang.String getMessageBody() {
            return this.messageBody;
        }

        @Override
        public final java.lang.String getPayloadOverride() {
            return this.payloadOverride;
        }

        @Override
        public final java.util.List<java.lang.String> getRecipients() {
            return this.recipients;
        }

        @Override
        public final java.lang.String getResolutionPayloadOverride() {
            return this.resolutionPayloadOverride;
        }

        @Override
        public final java.lang.String getSubject() {
            return this.subject;
        }

        @Override
        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getActionType() != null) {
                data.set("actionType", om.valueToTree(this.getActionType()));
            }
            if (this.getConnectionId() != null) {
                data.set("connectionId", om.valueToTree(this.getConnectionId()));
            }
            if (this.getConnectionType() != null) {
                data.set("connectionType", om.valueToTree(this.getConnectionType()));
            }
            if (this.getMessageBody() != null) {
                data.set("messageBody", om.valueToTree(this.getMessageBody()));
            }
            if (this.getPayloadOverride() != null) {
                data.set("payloadOverride", om.valueToTree(this.getPayloadOverride()));
            }
            if (this.getRecipients() != null) {
                data.set("recipients", om.valueToTree(this.getRecipients()));
            }
            if (this.getResolutionPayloadOverride() != null) {
                data.set("resolutionPayloadOverride", om.valueToTree(this.getResolutionPayloadOverride()));
            }
            if (this.getSubject() != null) {
                data.set("subject", om.valueToTree(this.getSubject()));
            }
            if (this.getTimeZone() != null) {
                data.set("timeZone", om.valueToTree(this.getTimeZone()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorNotificationsNotification"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorNotificationsNotification.Jsii$Proxy that = (MonitorNotificationsNotification.Jsii$Proxy) o;

            if (this.actionType != null ? !this.actionType.equals(that.actionType) : that.actionType != null) return false;
            if (this.connectionId != null ? !this.connectionId.equals(that.connectionId) : that.connectionId != null) return false;
            if (this.connectionType != null ? !this.connectionType.equals(that.connectionType) : that.connectionType != null) return false;
            if (this.messageBody != null ? !this.messageBody.equals(that.messageBody) : that.messageBody != null) return false;
            if (this.payloadOverride != null ? !this.payloadOverride.equals(that.payloadOverride) : that.payloadOverride != null) return false;
            if (this.recipients != null ? !this.recipients.equals(that.recipients) : that.recipients != null) return false;
            if (this.resolutionPayloadOverride != null ? !this.resolutionPayloadOverride.equals(that.resolutionPayloadOverride) : that.resolutionPayloadOverride != null) return false;
            if (this.subject != null ? !this.subject.equals(that.subject) : that.subject != null) return false;
            return this.timeZone != null ? this.timeZone.equals(that.timeZone) : that.timeZone == null;
        }

        @Override
        public final int hashCode() {
            int result = this.actionType != null ? this.actionType.hashCode() : 0;
            result = 31 * result + (this.connectionId != null ? this.connectionId.hashCode() : 0);
            result = 31 * result + (this.connectionType != null ? this.connectionType.hashCode() : 0);
            result = 31 * result + (this.messageBody != null ? this.messageBody.hashCode() : 0);
            result = 31 * result + (this.payloadOverride != null ? this.payloadOverride.hashCode() : 0);
            result = 31 * result + (this.recipients != null ? this.recipients.hashCode() : 0);
            result = 31 * result + (this.resolutionPayloadOverride != null ? this.resolutionPayloadOverride.hashCode() : 0);
            result = 31 * result + (this.subject != null ? this.subject.hashCode() : 0);
            result = 31 * result + (this.timeZone != null ? this.timeZone.hashCode() : 0);
            return result;
        }
    }
}
