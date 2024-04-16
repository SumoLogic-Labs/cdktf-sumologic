package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.881Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariableSourceDefinition")
@software.amazon.jsii.Jsii.Proxy(DashboardVariableSourceDefinition.Jsii$Proxy.class)
public interface DashboardVariableSourceDefinition extends software.amazon.jsii.JsiiSerializable {

    /**
     * csv_variable_source_definition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#csv_variable_source_definition Dashboard#csv_variable_source_definition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition getCsvVariableSourceDefinition() {
        return null;
    }

    /**
     * log_query_variable_source_definition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#log_query_variable_source_definition Dashboard#log_query_variable_source_definition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition getLogQueryVariableSourceDefinition() {
        return null;
    }

    /**
     * metadata_variable_source_definition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metadata_variable_source_definition Dashboard#metadata_variable_source_definition}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition getMetadataVariableSourceDefinition() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardVariableSourceDefinition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardVariableSourceDefinition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardVariableSourceDefinition> {
        com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition csvVariableSourceDefinition;
        com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition logQueryVariableSourceDefinition;
        com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition metadataVariableSourceDefinition;

        /**
         * Sets the value of {@link DashboardVariableSourceDefinition#getCsvVariableSourceDefinition}
         * @param csvVariableSourceDefinition csv_variable_source_definition block.
         *                                    Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#csv_variable_source_definition Dashboard#csv_variable_source_definition}
         * @return {@code this}
         */
        public Builder csvVariableSourceDefinition(com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition csvVariableSourceDefinition) {
            this.csvVariableSourceDefinition = csvVariableSourceDefinition;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariableSourceDefinition#getLogQueryVariableSourceDefinition}
         * @param logQueryVariableSourceDefinition log_query_variable_source_definition block.
         *                                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#log_query_variable_source_definition Dashboard#log_query_variable_source_definition}
         * @return {@code this}
         */
        public Builder logQueryVariableSourceDefinition(com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition logQueryVariableSourceDefinition) {
            this.logQueryVariableSourceDefinition = logQueryVariableSourceDefinition;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariableSourceDefinition#getMetadataVariableSourceDefinition}
         * @param metadataVariableSourceDefinition metadata_variable_source_definition block.
         *                                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#metadata_variable_source_definition Dashboard#metadata_variable_source_definition}
         * @return {@code this}
         */
        public Builder metadataVariableSourceDefinition(com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition metadataVariableSourceDefinition) {
            this.metadataVariableSourceDefinition = metadataVariableSourceDefinition;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardVariableSourceDefinition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardVariableSourceDefinition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardVariableSourceDefinition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardVariableSourceDefinition {
        private final com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition csvVariableSourceDefinition;
        private final com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition logQueryVariableSourceDefinition;
        private final com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition metadataVariableSourceDefinition;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.csvVariableSourceDefinition = software.amazon.jsii.Kernel.get(this, "csvVariableSourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition.class));
            this.logQueryVariableSourceDefinition = software.amazon.jsii.Kernel.get(this, "logQueryVariableSourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition.class));
            this.metadataVariableSourceDefinition = software.amazon.jsii.Kernel.get(this, "metadataVariableSourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.csvVariableSourceDefinition = builder.csvVariableSourceDefinition;
            this.logQueryVariableSourceDefinition = builder.logQueryVariableSourceDefinition;
            this.metadataVariableSourceDefinition = builder.metadataVariableSourceDefinition;
        }

        @Override
        public final com.sumologic.dashboard.DashboardVariableSourceDefinitionCsvVariableSourceDefinition getCsvVariableSourceDefinition() {
            return this.csvVariableSourceDefinition;
        }

        @Override
        public final com.sumologic.dashboard.DashboardVariableSourceDefinitionLogQueryVariableSourceDefinition getLogQueryVariableSourceDefinition() {
            return this.logQueryVariableSourceDefinition;
        }

        @Override
        public final com.sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition getMetadataVariableSourceDefinition() {
            return this.metadataVariableSourceDefinition;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCsvVariableSourceDefinition() != null) {
                data.set("csvVariableSourceDefinition", om.valueToTree(this.getCsvVariableSourceDefinition()));
            }
            if (this.getLogQueryVariableSourceDefinition() != null) {
                data.set("logQueryVariableSourceDefinition", om.valueToTree(this.getLogQueryVariableSourceDefinition()));
            }
            if (this.getMetadataVariableSourceDefinition() != null) {
                data.set("metadataVariableSourceDefinition", om.valueToTree(this.getMetadataVariableSourceDefinition()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardVariableSourceDefinition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardVariableSourceDefinition.Jsii$Proxy that = (DashboardVariableSourceDefinition.Jsii$Proxy) o;

            if (this.csvVariableSourceDefinition != null ? !this.csvVariableSourceDefinition.equals(that.csvVariableSourceDefinition) : that.csvVariableSourceDefinition != null) return false;
            if (this.logQueryVariableSourceDefinition != null ? !this.logQueryVariableSourceDefinition.equals(that.logQueryVariableSourceDefinition) : that.logQueryVariableSourceDefinition != null) return false;
            return this.metadataVariableSourceDefinition != null ? this.metadataVariableSourceDefinition.equals(that.metadataVariableSourceDefinition) : that.metadataVariableSourceDefinition == null;
        }

        @Override
        public final int hashCode() {
            int result = this.csvVariableSourceDefinition != null ? this.csvVariableSourceDefinition.hashCode() : 0;
            result = 31 * result + (this.logQueryVariableSourceDefinition != null ? this.logQueryVariableSourceDefinition.hashCode() : 0);
            result = 31 * result + (this.metadataVariableSourceDefinition != null ? this.metadataVariableSourceDefinition.hashCode() : 0);
            return result;
        }
    }
}
