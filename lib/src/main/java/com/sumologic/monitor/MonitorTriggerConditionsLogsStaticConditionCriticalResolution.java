package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.120Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsLogsStaticConditionCriticalResolution.Jsii$Proxy.class)
public interface MonitorTriggerConditionsLogsStaticConditionCriticalResolution extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution_window Monitor#resolution_window}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getResolutionWindow() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold_type Monitor#threshold_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getThresholdType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsLogsStaticConditionCriticalResolution> {
        java.lang.String resolutionWindow;
        java.lang.Number threshold;
        java.lang.String thresholdType;

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution#getResolutionWindow}
         * @param resolutionWindow Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution_window Monitor#resolution_window}.
         * @return {@code this}
         */
        public Builder resolutionWindow(java.lang.String resolutionWindow) {
            this.resolutionWindow = resolutionWindow;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution#getThresholdType}
         * @param thresholdType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold_type Monitor#threshold_type}.
         * @return {@code this}
         */
        public Builder thresholdType(java.lang.String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsLogsStaticConditionCriticalResolution build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsLogsStaticConditionCriticalResolution}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsLogsStaticConditionCriticalResolution {
        private final java.lang.String resolutionWindow;
        private final java.lang.Number threshold;
        private final java.lang.String thresholdType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.resolutionWindow = software.amazon.jsii.Kernel.get(this, "resolutionWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.thresholdType = software.amazon.jsii.Kernel.get(this, "thresholdType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.resolutionWindow = builder.resolutionWindow;
            this.threshold = builder.threshold;
            this.thresholdType = builder.thresholdType;
        }

        @Override
        public final java.lang.String getResolutionWindow() {
            return this.resolutionWindow;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        public final java.lang.String getThresholdType() {
            return this.thresholdType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getResolutionWindow() != null) {
                data.set("resolutionWindow", om.valueToTree(this.getResolutionWindow()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }
            if (this.getThresholdType() != null) {
                data.set("thresholdType", om.valueToTree(this.getThresholdType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsLogsStaticConditionCriticalResolution"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsLogsStaticConditionCriticalResolution.Jsii$Proxy that = (MonitorTriggerConditionsLogsStaticConditionCriticalResolution.Jsii$Proxy) o;

            if (this.resolutionWindow != null ? !this.resolutionWindow.equals(that.resolutionWindow) : that.resolutionWindow != null) return false;
            if (this.threshold != null ? !this.threshold.equals(that.threshold) : that.threshold != null) return false;
            return this.thresholdType != null ? this.thresholdType.equals(that.thresholdType) : that.thresholdType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.resolutionWindow != null ? this.resolutionWindow.hashCode() : 0;
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            result = 31 * result + (this.thresholdType != null ? this.thresholdType.hashCode() : 0);
            return result;
        }
    }
}
