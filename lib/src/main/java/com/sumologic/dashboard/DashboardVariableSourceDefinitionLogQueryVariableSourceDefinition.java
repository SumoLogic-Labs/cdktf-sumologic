package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.883Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition")
@software.amazon.jsii.Jsii.Proxy(DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition.Jsii$Proxy.class)
public interface DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#field Dashboard#field}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getField();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query Dashboard#query}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getQuery();

    /**
     * @return a {@link Builder} of {@link DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition> {
        java.lang.String field;
        java.lang.String query;

        /**
         * Sets the value of {@link DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition#getField}
         * @param field Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#field Dashboard#field}. This parameter is required.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition#getQuery}
         * @param query Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#query Dashboard#query}. This parameter is required.
         * @return {@code this}
         */
        public Builder query(java.lang.String query) {
            this.query = query;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition {
        private final java.lang.String field;
        private final java.lang.String query;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.query = software.amazon.jsii.Kernel.get(this, "query", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.field = java.util.Objects.requireNonNull(builder.field, "field is required");
            this.query = java.util.Objects.requireNonNull(builder.query, "query is required");
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final java.lang.String getQuery() {
            return this.query;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("field", om.valueToTree(this.getField()));
            data.set("query", om.valueToTree(this.getQuery()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition.Jsii$Proxy that = (DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition.Jsii$Proxy) o;

            if (!field.equals(that.field)) return false;
            return this.query.equals(that.query);
        }

        @Override
        public final int hashCode() {
            int result = this.field.hashCode();
            result = 31 * result + (this.query.hashCode());
            return result;
        }
    }
}
