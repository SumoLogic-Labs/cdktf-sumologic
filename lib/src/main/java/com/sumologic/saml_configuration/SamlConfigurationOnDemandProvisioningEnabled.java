package com.sumologic.saml_configuration;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.184Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.samlConfiguration.SamlConfigurationOnDemandProvisioningEnabled")
@software.amazon.jsii.Jsii.Proxy(SamlConfigurationOnDemandProvisioningEnabled.Jsii$Proxy.class)
public interface SamlConfigurationOnDemandProvisioningEnabled extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#on_demand_provisioning_roles SamlConfiguration#on_demand_provisioning_roles}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getOnDemandProvisioningRoles();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#first_name_attribute SamlConfiguration#first_name_attribute}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFirstNameAttribute() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#last_name_attribute SamlConfiguration#last_name_attribute}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLastNameAttribute() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SamlConfigurationOnDemandProvisioningEnabled}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SamlConfigurationOnDemandProvisioningEnabled}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SamlConfigurationOnDemandProvisioningEnabled> {
        java.util.List<java.lang.String> onDemandProvisioningRoles;
        java.lang.String firstNameAttribute;
        java.lang.String lastNameAttribute;

        /**
         * Sets the value of {@link SamlConfigurationOnDemandProvisioningEnabled#getOnDemandProvisioningRoles}
         * @param onDemandProvisioningRoles Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#on_demand_provisioning_roles SamlConfiguration#on_demand_provisioning_roles}. This parameter is required.
         * @return {@code this}
         */
        public Builder onDemandProvisioningRoles(java.util.List<java.lang.String> onDemandProvisioningRoles) {
            this.onDemandProvisioningRoles = onDemandProvisioningRoles;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationOnDemandProvisioningEnabled#getFirstNameAttribute}
         * @param firstNameAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#first_name_attribute SamlConfiguration#first_name_attribute}.
         * @return {@code this}
         */
        public Builder firstNameAttribute(java.lang.String firstNameAttribute) {
            this.firstNameAttribute = firstNameAttribute;
            return this;
        }

        /**
         * Sets the value of {@link SamlConfigurationOnDemandProvisioningEnabled#getLastNameAttribute}
         * @param lastNameAttribute Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/saml_configuration#last_name_attribute SamlConfiguration#last_name_attribute}.
         * @return {@code this}
         */
        public Builder lastNameAttribute(java.lang.String lastNameAttribute) {
            this.lastNameAttribute = lastNameAttribute;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SamlConfigurationOnDemandProvisioningEnabled}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SamlConfigurationOnDemandProvisioningEnabled build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SamlConfigurationOnDemandProvisioningEnabled}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SamlConfigurationOnDemandProvisioningEnabled {
        private final java.util.List<java.lang.String> onDemandProvisioningRoles;
        private final java.lang.String firstNameAttribute;
        private final java.lang.String lastNameAttribute;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.onDemandProvisioningRoles = software.amazon.jsii.Kernel.get(this, "onDemandProvisioningRoles", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.firstNameAttribute = software.amazon.jsii.Kernel.get(this, "firstNameAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lastNameAttribute = software.amazon.jsii.Kernel.get(this, "lastNameAttribute", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.onDemandProvisioningRoles = java.util.Objects.requireNonNull(builder.onDemandProvisioningRoles, "onDemandProvisioningRoles is required");
            this.firstNameAttribute = builder.firstNameAttribute;
            this.lastNameAttribute = builder.lastNameAttribute;
        }

        @Override
        public final java.util.List<java.lang.String> getOnDemandProvisioningRoles() {
            return this.onDemandProvisioningRoles;
        }

        @Override
        public final java.lang.String getFirstNameAttribute() {
            return this.firstNameAttribute;
        }

        @Override
        public final java.lang.String getLastNameAttribute() {
            return this.lastNameAttribute;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("onDemandProvisioningRoles", om.valueToTree(this.getOnDemandProvisioningRoles()));
            if (this.getFirstNameAttribute() != null) {
                data.set("firstNameAttribute", om.valueToTree(this.getFirstNameAttribute()));
            }
            if (this.getLastNameAttribute() != null) {
                data.set("lastNameAttribute", om.valueToTree(this.getLastNameAttribute()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.samlConfiguration.SamlConfigurationOnDemandProvisioningEnabled"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SamlConfigurationOnDemandProvisioningEnabled.Jsii$Proxy that = (SamlConfigurationOnDemandProvisioningEnabled.Jsii$Proxy) o;

            if (!onDemandProvisioningRoles.equals(that.onDemandProvisioningRoles)) return false;
            if (this.firstNameAttribute != null ? !this.firstNameAttribute.equals(that.firstNameAttribute) : that.firstNameAttribute != null) return false;
            return this.lastNameAttribute != null ? this.lastNameAttribute.equals(that.lastNameAttribute) : that.lastNameAttribute == null;
        }

        @Override
        public final int hashCode() {
            int result = this.onDemandProvisioningRoles.hashCode();
            result = 31 * result + (this.firstNameAttribute != null ? this.firstNameAttribute.hashCode() : 0);
            result = 31 * result + (this.lastNameAttribute != null ? this.lastNameAttribute.hashCode() : 0);
            return result;
        }
    }
}
