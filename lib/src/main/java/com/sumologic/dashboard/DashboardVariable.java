package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.879Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariable")
@software.amazon.jsii.Jsii.Proxy(DashboardVariable.Jsii$Proxy.class)
public interface DashboardVariable extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#name Dashboard#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * source_definition block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#source_definition Dashboard#source_definition}
     */
    @org.jetbrains.annotations.NotNull com.sumologic.dashboard.DashboardVariableSourceDefinition getSourceDefinition();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#allow_multi_select Dashboard#allow_multi_select}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAllowMultiSelect() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#default_value Dashboard#default_value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultValue() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#display_name Dashboard#display_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDisplayName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#hide_from_ui Dashboard#hide_from_ui}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getHideFromUi() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_all_option Dashboard#include_all_option}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getIncludeAllOption() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardVariable}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardVariable}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardVariable> {
        java.lang.String name;
        com.sumologic.dashboard.DashboardVariableSourceDefinition sourceDefinition;
        java.lang.Object allowMultiSelect;
        java.lang.String defaultValue;
        java.lang.String displayName;
        java.lang.Object hideFromUi;
        java.lang.Object includeAllOption;

        /**
         * Sets the value of {@link DashboardVariable#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#name Dashboard#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getSourceDefinition}
         * @param sourceDefinition source_definition block. This parameter is required.
         *                         Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#source_definition Dashboard#source_definition}
         * @return {@code this}
         */
        public Builder sourceDefinition(com.sumologic.dashboard.DashboardVariableSourceDefinition sourceDefinition) {
            this.sourceDefinition = sourceDefinition;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getAllowMultiSelect}
         * @param allowMultiSelect Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#allow_multi_select Dashboard#allow_multi_select}.
         * @return {@code this}
         */
        public Builder allowMultiSelect(java.lang.Boolean allowMultiSelect) {
            this.allowMultiSelect = allowMultiSelect;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getAllowMultiSelect}
         * @param allowMultiSelect Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#allow_multi_select Dashboard#allow_multi_select}.
         * @return {@code this}
         */
        public Builder allowMultiSelect(com.hashicorp.cdktf.IResolvable allowMultiSelect) {
            this.allowMultiSelect = allowMultiSelect;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getDefaultValue}
         * @param defaultValue Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#default_value Dashboard#default_value}.
         * @return {@code this}
         */
        public Builder defaultValue(java.lang.String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getDisplayName}
         * @param displayName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#display_name Dashboard#display_name}.
         * @return {@code this}
         */
        public Builder displayName(java.lang.String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getHideFromUi}
         * @param hideFromUi Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#hide_from_ui Dashboard#hide_from_ui}.
         * @return {@code this}
         */
        public Builder hideFromUi(java.lang.Boolean hideFromUi) {
            this.hideFromUi = hideFromUi;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getHideFromUi}
         * @param hideFromUi Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#hide_from_ui Dashboard#hide_from_ui}.
         * @return {@code this}
         */
        public Builder hideFromUi(com.hashicorp.cdktf.IResolvable hideFromUi) {
            this.hideFromUi = hideFromUi;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getIncludeAllOption}
         * @param includeAllOption Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_all_option Dashboard#include_all_option}.
         * @return {@code this}
         */
        public Builder includeAllOption(java.lang.Boolean includeAllOption) {
            this.includeAllOption = includeAllOption;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariable#getIncludeAllOption}
         * @param includeAllOption Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#include_all_option Dashboard#include_all_option}.
         * @return {@code this}
         */
        public Builder includeAllOption(com.hashicorp.cdktf.IResolvable includeAllOption) {
            this.includeAllOption = includeAllOption;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardVariable}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardVariable build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardVariable}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardVariable {
        private final java.lang.String name;
        private final com.sumologic.dashboard.DashboardVariableSourceDefinition sourceDefinition;
        private final java.lang.Object allowMultiSelect;
        private final java.lang.String defaultValue;
        private final java.lang.String displayName;
        private final java.lang.Object hideFromUi;
        private final java.lang.Object includeAllOption;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.sourceDefinition = software.amazon.jsii.Kernel.get(this, "sourceDefinition", software.amazon.jsii.NativeType.forClass(com.sumologic.dashboard.DashboardVariableSourceDefinition.class));
            this.allowMultiSelect = software.amazon.jsii.Kernel.get(this, "allowMultiSelect", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "defaultValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.displayName = software.amazon.jsii.Kernel.get(this, "displayName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hideFromUi = software.amazon.jsii.Kernel.get(this, "hideFromUi", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.includeAllOption = software.amazon.jsii.Kernel.get(this, "includeAllOption", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.sourceDefinition = java.util.Objects.requireNonNull(builder.sourceDefinition, "sourceDefinition is required");
            this.allowMultiSelect = builder.allowMultiSelect;
            this.defaultValue = builder.defaultValue;
            this.displayName = builder.displayName;
            this.hideFromUi = builder.hideFromUi;
            this.includeAllOption = builder.includeAllOption;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final com.sumologic.dashboard.DashboardVariableSourceDefinition getSourceDefinition() {
            return this.sourceDefinition;
        }

        @Override
        public final java.lang.Object getAllowMultiSelect() {
            return this.allowMultiSelect;
        }

        @Override
        public final java.lang.String getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        @Override
        public final java.lang.Object getHideFromUi() {
            return this.hideFromUi;
        }

        @Override
        public final java.lang.Object getIncludeAllOption() {
            return this.includeAllOption;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            data.set("sourceDefinition", om.valueToTree(this.getSourceDefinition()));
            if (this.getAllowMultiSelect() != null) {
                data.set("allowMultiSelect", om.valueToTree(this.getAllowMultiSelect()));
            }
            if (this.getDefaultValue() != null) {
                data.set("defaultValue", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getDisplayName() != null) {
                data.set("displayName", om.valueToTree(this.getDisplayName()));
            }
            if (this.getHideFromUi() != null) {
                data.set("hideFromUi", om.valueToTree(this.getHideFromUi()));
            }
            if (this.getIncludeAllOption() != null) {
                data.set("includeAllOption", om.valueToTree(this.getIncludeAllOption()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardVariable"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardVariable.Jsii$Proxy that = (DashboardVariable.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (!sourceDefinition.equals(that.sourceDefinition)) return false;
            if (this.allowMultiSelect != null ? !this.allowMultiSelect.equals(that.allowMultiSelect) : that.allowMultiSelect != null) return false;
            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.displayName != null ? !this.displayName.equals(that.displayName) : that.displayName != null) return false;
            if (this.hideFromUi != null ? !this.hideFromUi.equals(that.hideFromUi) : that.hideFromUi != null) return false;
            return this.includeAllOption != null ? this.includeAllOption.equals(that.includeAllOption) : that.includeAllOption == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.sourceDefinition.hashCode());
            result = 31 * result + (this.allowMultiSelect != null ? this.allowMultiSelect.hashCode() : 0);
            result = 31 * result + (this.defaultValue != null ? this.defaultValue.hashCode() : 0);
            result = 31 * result + (this.displayName != null ? this.displayName.hashCode() : 0);
            result = 31 * result + (this.hideFromUi != null ? this.hideFromUi.hashCode() : 0);
            result = 31 * result + (this.includeAllOption != null ? this.includeAllOption.hashCode() : 0);
            return result;
        }
    }
}
