package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.126Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsSloSliConditionWarning.Jsii$Proxy.class)
public interface MonitorTriggerConditionsSloSliConditionWarning extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#sli_threshold Monitor#sli_threshold}.
     */
    @org.jetbrains.annotations.NotNull java.lang.Number getSliThreshold();

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsSloSliConditionWarning}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsSloSliConditionWarning}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsSloSliConditionWarning> {
        java.lang.Number sliThreshold;

        /**
         * Sets the value of {@link MonitorTriggerConditionsSloSliConditionWarning#getSliThreshold}
         * @param sliThreshold Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#sli_threshold Monitor#sli_threshold}. This parameter is required.
         * @return {@code this}
         */
        public Builder sliThreshold(java.lang.Number sliThreshold) {
            this.sliThreshold = sliThreshold;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsSloSliConditionWarning}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsSloSliConditionWarning build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsSloSliConditionWarning}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsSloSliConditionWarning {
        private final java.lang.Number sliThreshold;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.sliThreshold = software.amazon.jsii.Kernel.get(this, "sliThreshold", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.sliThreshold = java.util.Objects.requireNonNull(builder.sliThreshold, "sliThreshold is required");
        }

        @Override
        public final java.lang.Number getSliThreshold() {
            return this.sliThreshold;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("sliThreshold", om.valueToTree(this.getSliThreshold()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsSloSliConditionWarning"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsSloSliConditionWarning.Jsii$Proxy that = (MonitorTriggerConditionsSloSliConditionWarning.Jsii$Proxy) o;

            return this.sliThreshold.equals(that.sliThreshold);
        }

        @Override
        public final int hashCode() {
            int result = this.sliThreshold.hashCode();
            return result;
        }
    }
}
