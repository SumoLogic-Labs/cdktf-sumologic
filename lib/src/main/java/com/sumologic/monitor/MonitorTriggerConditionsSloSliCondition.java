package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.126Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsSloSliCondition")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsSloSliCondition.Jsii$Proxy.class)
public interface MonitorTriggerConditionsSloSliCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     * critical block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#critical Monitor#critical}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionCritical getCritical() {
        return null;
    }

    /**
     * warning block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#warning Monitor#warning}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning getWarning() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsSloSliCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsSloSliCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsSloSliCondition> {
        com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionCritical critical;
        com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning warning;

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloSliCondition#getCritical}
         * @param critical critical block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#critical Monitor#critical}
         * @return {@code this}
         */
        public Builder critical(com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionCritical critical) {
            this.critical = critical;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloSliCondition#getWarning}
         * @param warning warning block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#warning Monitor#warning}
         * @return {@code this}
         */
        public Builder warning(com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning warning) {
            this.warning = warning;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsSloSliCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsSloSliCondition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsSloSliCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsSloSliCondition {
        private final com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionCritical critical;
        private final com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning warning;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.critical = software.amazon.jsii.Kernel.get(this, "critical", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionCritical.class));
            this.warning = software.amazon.jsii.Kernel.get(this, "warning", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.critical = builder.critical;
            this.warning = builder.warning;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionCritical getCritical() {
            return this.critical;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning getWarning() {
            return this.warning;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCritical() != null) {
                data.set("critical", om.valueToTree(this.getCritical()));
            }
            if (this.getWarning() != null) {
                data.set("warning", om.valueToTree(this.getWarning()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsSloSliCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsSloSliCondition.Jsii$Proxy that = (MonitorTriggerConditionsSloSliCondition.Jsii$Proxy) o;

            if (this.critical != null ? !this.critical.equals(that.critical) : that.critical != null) return false;
            return this.warning != null ? this.warning.equals(that.warning) : that.warning == null;
        }

        @Override
        public final int hashCode() {
            int result = this.critical != null ? this.critical.hashCode() : 0;
            result = 31 * result + (this.warning != null ? this.warning.hashCode() : 0);
            return result;
        }
    }
}
