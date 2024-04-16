package com.sumologic.log_search;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.085Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.logSearch.LogSearchScheduleNotificationServiceNowSearchNotificationFields")
@software.amazon.jsii.Jsii.Proxy(LogSearchScheduleNotificationServiceNowSearchNotificationFields.Jsii$Proxy.class)
public interface LogSearchScheduleNotificationServiceNowSearchNotificationFields extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#event_type LogSearch#event_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEventType() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#node LogSearch#node}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeAttribute() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#resource LogSearch#resource}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResource() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#severity LogSearch#severity}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSeverity() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LogSearchScheduleNotificationServiceNowSearchNotificationFields> {
        java.lang.String eventType;
        java.lang.String nodeAttribute;
        java.lang.String resource;
        java.lang.Number severity;

        /**
         * Sets the value of {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields#getEventType}
         * @param eventType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#event_type LogSearch#event_type}.
         * @return {@code this}
         */
        public Builder eventType(java.lang.String eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields#getNodeAttribute}
         * @param nodeAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#node LogSearch#node}.
         * @return {@code this}
         */
        public Builder nodeAttribute(java.lang.String nodeAttribute) {
            this.nodeAttribute = nodeAttribute;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields#getResource}
         * @param resource Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#resource LogSearch#resource}.
         * @return {@code this}
         */
        public Builder resource(java.lang.String resource) {
            this.resource = resource;
            return this;
        }

        /**
         * Sets the value of {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields#getSeverity}
         * @param severity Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/log_search#severity LogSearch#severity}.
         * @return {@code this}
         */
        public Builder severity(java.lang.Number severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LogSearchScheduleNotificationServiceNowSearchNotificationFields build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link LogSearchScheduleNotificationServiceNowSearchNotificationFields}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LogSearchScheduleNotificationServiceNowSearchNotificationFields {
        private final java.lang.String eventType;
        private final java.lang.String nodeAttribute;
        private final java.lang.String resource;
        private final java.lang.Number severity;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.eventType = software.amazon.jsii.Kernel.get(this, "eventType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeAttribute = software.amazon.jsii.Kernel.get(this, "nodeAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resource = software.amazon.jsii.Kernel.get(this, "resource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.severity = software.amazon.jsii.Kernel.get(this, "severity", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.eventType = builder.eventType;
            this.nodeAttribute = builder.nodeAttribute;
            this.resource = builder.resource;
            this.severity = builder.severity;
        }

        @Override
        public final java.lang.String getEventType() {
            return this.eventType;
        }

        @Override
        public final java.lang.String getNodeAttribute() {
            return this.nodeAttribute;
        }

        @Override
        public final java.lang.String getResource() {
            return this.resource;
        }

        @Override
        public final java.lang.Number getSeverity() {
            return this.severity;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getEventType() != null) {
                data.set("eventType", om.valueToTree(this.getEventType()));
            }
            if (this.getNodeAttribute() != null) {
                data.set("nodeAttribute", om.valueToTree(this.getNodeAttribute()));
            }
            if (this.getResource() != null) {
                data.set("resource", om.valueToTree(this.getResource()));
            }
            if (this.getSeverity() != null) {
                data.set("severity", om.valueToTree(this.getSeverity()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.logSearch.LogSearchScheduleNotificationServiceNowSearchNotificationFields"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LogSearchScheduleNotificationServiceNowSearchNotificationFields.Jsii$Proxy that = (LogSearchScheduleNotificationServiceNowSearchNotificationFields.Jsii$Proxy) o;

            if (this.eventType != null ? !this.eventType.equals(that.eventType) : that.eventType != null) return false;
            if (this.nodeAttribute != null ? !this.nodeAttribute.equals(that.nodeAttribute) : that.nodeAttribute != null) return false;
            if (this.resource != null ? !this.resource.equals(that.resource) : that.resource != null) return false;
            return this.severity != null ? this.severity.equals(that.severity) : that.severity == null;
        }

        @Override
        public final int hashCode() {
            int result = this.eventType != null ? this.eventType.hashCode() : 0;
            result = 31 * result + (this.nodeAttribute != null ? this.nodeAttribute.hashCode() : 0);
            result = 31 * result + (this.resource != null ? this.resource.hashCode() : 0);
            result = 31 * result + (this.severity != null ? this.severity.hashCode() : 0);
            return result;
        }
    }
}
