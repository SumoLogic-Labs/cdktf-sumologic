package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.126Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggers")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggers.Jsii$Proxy.class)
public interface MonitorTriggers extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#detection_method Monitor#detection_method}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDetectionMethod() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#min_data_points Monitor#min_data_points}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getMinDataPoints() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#occurrence_type Monitor#occurrence_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getOccurrenceType() {
        return null;
    }

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
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimeRange() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_source Monitor#trigger_source}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTriggerSource() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_type Monitor#trigger_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTriggerType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggers}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggers}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggers> {
        java.lang.String detectionMethod;
        java.lang.Number minDataPoints;
        java.lang.String occurrenceType;
        java.lang.String resolutionWindow;
        java.lang.Number threshold;
        java.lang.String thresholdType;
        java.lang.String timeRange;
        java.lang.String triggerSource;
        java.lang.String triggerType;

        /**
         * Sets the value of {@link MonitorTriggers#getDetectionMethod}
         * @param detectionMethod Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#detection_method Monitor#detection_method}.
         * @return {@code this}
         */
        public Builder detectionMethod(java.lang.String detectionMethod) {
            this.detectionMethod = detectionMethod;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getMinDataPoints}
         * @param minDataPoints Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#min_data_points Monitor#min_data_points}.
         * @return {@code this}
         */
        public Builder minDataPoints(java.lang.Number minDataPoints) {
            this.minDataPoints = minDataPoints;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getOccurrenceType}
         * @param occurrenceType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#occurrence_type Monitor#occurrence_type}.
         * @return {@code this}
         */
        public Builder occurrenceType(java.lang.String occurrenceType) {
            this.occurrenceType = occurrenceType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getResolutionWindow}
         * @param resolutionWindow Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#resolution_window Monitor#resolution_window}.
         * @return {@code this}
         */
        public Builder resolutionWindow(java.lang.String resolutionWindow) {
            this.resolutionWindow = resolutionWindow;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getThresholdType}
         * @param thresholdType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold_type Monitor#threshold_type}.
         * @return {@code this}
         */
        public Builder thresholdType(java.lang.String thresholdType) {
            this.thresholdType = thresholdType;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getTimeRange}
         * @param timeRange Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#time_range Monitor#time_range}.
         * @return {@code this}
         */
        public Builder timeRange(java.lang.String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getTriggerSource}
         * @param triggerSource Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_source Monitor#trigger_source}.
         * @return {@code this}
         */
        public Builder triggerSource(java.lang.String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggers#getTriggerType}
         * @param triggerType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#trigger_type Monitor#trigger_type}.
         * @return {@code this}
         */
        public Builder triggerType(java.lang.String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggers}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggers build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggers}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggers {
        private final java.lang.String detectionMethod;
        private final java.lang.Number minDataPoints;
        private final java.lang.String occurrenceType;
        private final java.lang.String resolutionWindow;
        private final java.lang.Number threshold;
        private final java.lang.String thresholdType;
        private final java.lang.String timeRange;
        private final java.lang.String triggerSource;
        private final java.lang.String triggerType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.detectionMethod = software.amazon.jsii.Kernel.get(this, "detectionMethod", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.minDataPoints = software.amazon.jsii.Kernel.get(this, "minDataPoints", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.occurrenceType = software.amazon.jsii.Kernel.get(this, "occurrenceType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.resolutionWindow = software.amazon.jsii.Kernel.get(this, "resolutionWindow", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.thresholdType = software.amazon.jsii.Kernel.get(this, "thresholdType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.timeRange = software.amazon.jsii.Kernel.get(this, "timeRange", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.triggerSource = software.amazon.jsii.Kernel.get(this, "triggerSource", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.triggerType = software.amazon.jsii.Kernel.get(this, "triggerType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.detectionMethod = builder.detectionMethod;
            this.minDataPoints = builder.minDataPoints;
            this.occurrenceType = builder.occurrenceType;
            this.resolutionWindow = builder.resolutionWindow;
            this.threshold = builder.threshold;
            this.thresholdType = builder.thresholdType;
            this.timeRange = builder.timeRange;
            this.triggerSource = builder.triggerSource;
            this.triggerType = builder.triggerType;
        }

        @Override
        public final java.lang.String getDetectionMethod() {
            return this.detectionMethod;
        }

        @Override
        public final java.lang.Number getMinDataPoints() {
            return this.minDataPoints;
        }

        @Override
        public final java.lang.String getOccurrenceType() {
            return this.occurrenceType;
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
        public final java.lang.String getTimeRange() {
            return this.timeRange;
        }

        @Override
        public final java.lang.String getTriggerSource() {
            return this.triggerSource;
        }

        @Override
        public final java.lang.String getTriggerType() {
            return this.triggerType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getDetectionMethod() != null) {
                data.set("detectionMethod", om.valueToTree(this.getDetectionMethod()));
            }
            if (this.getMinDataPoints() != null) {
                data.set("minDataPoints", om.valueToTree(this.getMinDataPoints()));
            }
            if (this.getOccurrenceType() != null) {
                data.set("occurrenceType", om.valueToTree(this.getOccurrenceType()));
            }
            if (this.getResolutionWindow() != null) {
                data.set("resolutionWindow", om.valueToTree(this.getResolutionWindow()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }
            if (this.getThresholdType() != null) {
                data.set("thresholdType", om.valueToTree(this.getThresholdType()));
            }
            if (this.getTimeRange() != null) {
                data.set("timeRange", om.valueToTree(this.getTimeRange()));
            }
            if (this.getTriggerSource() != null) {
                data.set("triggerSource", om.valueToTree(this.getTriggerSource()));
            }
            if (this.getTriggerType() != null) {
                data.set("triggerType", om.valueToTree(this.getTriggerType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggers"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggers.Jsii$Proxy that = (MonitorTriggers.Jsii$Proxy) o;

            if (this.detectionMethod != null ? !this.detectionMethod.equals(that.detectionMethod) : that.detectionMethod != null) return false;
            if (this.minDataPoints != null ? !this.minDataPoints.equals(that.minDataPoints) : that.minDataPoints != null) return false;
            if (this.occurrenceType != null ? !this.occurrenceType.equals(that.occurrenceType) : that.occurrenceType != null) return false;
            if (this.resolutionWindow != null ? !this.resolutionWindow.equals(that.resolutionWindow) : that.resolutionWindow != null) return false;
            if (this.threshold != null ? !this.threshold.equals(that.threshold) : that.threshold != null) return false;
            if (this.thresholdType != null ? !this.thresholdType.equals(that.thresholdType) : that.thresholdType != null) return false;
            if (this.timeRange != null ? !this.timeRange.equals(that.timeRange) : that.timeRange != null) return false;
            if (this.triggerSource != null ? !this.triggerSource.equals(that.triggerSource) : that.triggerSource != null) return false;
            return this.triggerType != null ? this.triggerType.equals(that.triggerType) : that.triggerType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.detectionMethod != null ? this.detectionMethod.hashCode() : 0;
            result = 31 * result + (this.minDataPoints != null ? this.minDataPoints.hashCode() : 0);
            result = 31 * result + (this.occurrenceType != null ? this.occurrenceType.hashCode() : 0);
            result = 31 * result + (this.resolutionWindow != null ? this.resolutionWindow.hashCode() : 0);
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            result = 31 * result + (this.thresholdType != null ? this.thresholdType.hashCode() : 0);
            result = 31 * result + (this.timeRange != null ? this.timeRange.hashCode() : 0);
            result = 31 * result + (this.triggerSource != null ? this.triggerSource.hashCode() : 0);
            result = 31 * result + (this.triggerType != null ? this.triggerType.hashCode() : 0);
            return result;
        }
    }
}
