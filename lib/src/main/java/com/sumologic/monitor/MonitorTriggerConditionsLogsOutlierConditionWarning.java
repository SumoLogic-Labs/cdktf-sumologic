package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.119Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsLogsOutlierConditionWarning.Jsii$Proxy.class)
public interface MonitorTriggerConditionsLogsOutlierConditionWarning extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#consecutive Monitor#consecutive}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getConsecutive() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getThreshold() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#window Monitor#window}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getWindow() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsLogsOutlierConditionWarning}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsLogsOutlierConditionWarning}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsLogsOutlierConditionWarning> {
        java.lang.Number consecutive;
        java.lang.Number threshold;
        java.lang.Number window;

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierConditionWarning#getConsecutive}
         * @param consecutive Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#consecutive Monitor#consecutive}.
         * @return {@code this}
         */
        public Builder consecutive(java.lang.Number consecutive) {
            this.consecutive = consecutive;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierConditionWarning#getThreshold}
         * @param threshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#threshold Monitor#threshold}.
         * @return {@code this}
         */
        public Builder threshold(java.lang.Number threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierConditionWarning#getWindow}
         * @param window Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#window Monitor#window}.
         * @return {@code this}
         */
        public Builder window(java.lang.Number window) {
            this.window = window;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsLogsOutlierConditionWarning}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsLogsOutlierConditionWarning build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsLogsOutlierConditionWarning}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsLogsOutlierConditionWarning {
        private final java.lang.Number consecutive;
        private final java.lang.Number threshold;
        private final java.lang.Number window;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.consecutive = software.amazon.jsii.Kernel.get(this, "consecutive", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.threshold = software.amazon.jsii.Kernel.get(this, "threshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.window = software.amazon.jsii.Kernel.get(this, "window", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.consecutive = builder.consecutive;
            this.threshold = builder.threshold;
            this.window = builder.window;
        }

        @Override
        public final java.lang.Number getConsecutive() {
            return this.consecutive;
        }

        @Override
        public final java.lang.Number getThreshold() {
            return this.threshold;
        }

        @Override
        public final java.lang.Number getWindow() {
            return this.window;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getConsecutive() != null) {
                data.set("consecutive", om.valueToTree(this.getConsecutive()));
            }
            if (this.getThreshold() != null) {
                data.set("threshold", om.valueToTree(this.getThreshold()));
            }
            if (this.getWindow() != null) {
                data.set("window", om.valueToTree(this.getWindow()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsLogsOutlierConditionWarning.Jsii$Proxy that = (MonitorTriggerConditionsLogsOutlierConditionWarning.Jsii$Proxy) o;

            if (this.consecutive != null ? !this.consecutive.equals(that.consecutive) : that.consecutive != null) return false;
            if (this.threshold != null ? !this.threshold.equals(that.threshold) : that.threshold != null) return false;
            return this.window != null ? this.window.equals(that.window) : that.window == null;
        }

        @Override
        public final int hashCode() {
            int result = this.consecutive != null ? this.consecutive.hashCode() : 0;
            result = 31 * result + (this.threshold != null ? this.threshold.hashCode() : 0);
            result = 31 * result + (this.window != null ? this.window.hashCode() : 0);
            return result;
        }
    }
}
