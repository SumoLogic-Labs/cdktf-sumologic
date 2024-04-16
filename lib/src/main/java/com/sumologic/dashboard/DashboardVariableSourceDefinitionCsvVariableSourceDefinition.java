package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.882Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition")
@software.amazon.jsii.Jsii.Proxy(DashboardVariableSourceDefinitionCsvVariableSourceDefinition.Jsii$Proxy.class)
public interface DashboardVariableSourceDefinitionCsvVariableSourceDefinition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#values Dashboard#values}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValues();

    /**
     * @return a {@link Builder} of {@link DashboardVariableSourceDefinitionCsvVariableSourceDefinition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardVariableSourceDefinitionCsvVariableSourceDefinition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardVariableSourceDefinitionCsvVariableSourceDefinition> {
        java.lang.String values;

        /**
         * Sets the value of {@link DashboardVariableSourceDefinitionCsvVariableSourceDefinition#getValues}
         * @param values Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#values Dashboard#values}. This parameter is required.
         * @return {@code this}
         */
        public Builder values(java.lang.String values) {
            this.values = values;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardVariableSourceDefinitionCsvVariableSourceDefinition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardVariableSourceDefinitionCsvVariableSourceDefinition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardVariableSourceDefinitionCsvVariableSourceDefinition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardVariableSourceDefinitionCsvVariableSourceDefinition {
        private final java.lang.String values;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.values = software.amazon.jsii.Kernel.get(this, "values", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.values = java.util.Objects.requireNonNull(builder.values, "values is required");
        }

        @Override
        public final java.lang.String getValues() {
            return this.values;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("values", om.valueToTree(this.getValues()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardVariableSourceDefinitionCsvVariableSourceDefinition.Jsii$Proxy that = (DashboardVariableSourceDefinitionCsvVariableSourceDefinition.Jsii$Proxy) o;

            return this.values.equals(that.values);
        }

        @Override
        public final int hashCode() {
            int result = this.values.hashCode();
            return result;
        }
    }
}
