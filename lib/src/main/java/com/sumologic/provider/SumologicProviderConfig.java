package com.sumologic.provider;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.147Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.provider.SumologicProviderConfig")
@software.amazon.jsii.Jsii.Proxy(SumologicProviderConfig.Jsii$Proxy.class)
public interface SumologicProviderConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#access_id SumologicProvider#access_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAccessId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#access_key SumologicProvider#access_key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getAccessKey();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#admin_mode SumologicProvider#admin_mode}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getAdminMode() {
        return null;
    }

    /**
     * Alias name.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#alias SumologicProvider#alias}
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getAlias() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#base_url SumologicProvider#base_url}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBaseUrl() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#environment SumologicProvider#environment}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getEnvironment() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SumologicProviderConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SumologicProviderConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SumologicProviderConfig> {
        java.lang.String accessId;
        java.lang.String accessKey;
        java.lang.Object adminMode;
        java.lang.String alias;
        java.lang.String baseUrl;
        java.lang.String environment;

        /**
         * Sets the value of {@link SumologicProviderConfig#getAccessId}
         * @param accessId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#access_id SumologicProvider#access_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder accessId(java.lang.String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * Sets the value of {@link SumologicProviderConfig#getAccessKey}
         * @param accessKey Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#access_key SumologicProvider#access_key}. This parameter is required.
         * @return {@code this}
         */
        public Builder accessKey(java.lang.String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Sets the value of {@link SumologicProviderConfig#getAdminMode}
         * @param adminMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#admin_mode SumologicProvider#admin_mode}.
         * @return {@code this}
         */
        public Builder adminMode(java.lang.Boolean adminMode) {
            this.adminMode = adminMode;
            return this;
        }

        /**
         * Sets the value of {@link SumologicProviderConfig#getAdminMode}
         * @param adminMode Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#admin_mode SumologicProvider#admin_mode}.
         * @return {@code this}
         */
        public Builder adminMode(com.hashicorp.cdktf.IResolvable adminMode) {
            this.adminMode = adminMode;
            return this;
        }

        /**
         * Sets the value of {@link SumologicProviderConfig#getAlias}
         * @param alias Alias name.
         *              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#alias SumologicProvider#alias}
         * @return {@code this}
         */
        public Builder alias(java.lang.String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * Sets the value of {@link SumologicProviderConfig#getBaseUrl}
         * @param baseUrl Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#base_url SumologicProvider#base_url}.
         * @return {@code this}
         */
        public Builder baseUrl(java.lang.String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * Sets the value of {@link SumologicProviderConfig#getEnvironment}
         * @param environment Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs#environment SumologicProvider#environment}.
         * @return {@code this}
         */
        public Builder environment(java.lang.String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SumologicProviderConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SumologicProviderConfig build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SumologicProviderConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SumologicProviderConfig {
        private final java.lang.String accessId;
        private final java.lang.String accessKey;
        private final java.lang.Object adminMode;
        private final java.lang.String alias;
        private final java.lang.String baseUrl;
        private final java.lang.String environment;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.accessId = software.amazon.jsii.Kernel.get(this, "accessId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.accessKey = software.amazon.jsii.Kernel.get(this, "accessKey", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.adminMode = software.amazon.jsii.Kernel.get(this, "adminMode", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.alias = software.amazon.jsii.Kernel.get(this, "alias", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.baseUrl = software.amazon.jsii.Kernel.get(this, "baseUrl", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.environment = software.amazon.jsii.Kernel.get(this, "environment", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.accessId = java.util.Objects.requireNonNull(builder.accessId, "accessId is required");
            this.accessKey = java.util.Objects.requireNonNull(builder.accessKey, "accessKey is required");
            this.adminMode = builder.adminMode;
            this.alias = builder.alias;
            this.baseUrl = builder.baseUrl;
            this.environment = builder.environment;
        }

        @Override
        public final java.lang.String getAccessId() {
            return this.accessId;
        }

        @Override
        public final java.lang.String getAccessKey() {
            return this.accessKey;
        }

        @Override
        public final java.lang.Object getAdminMode() {
            return this.adminMode;
        }

        @Override
        public final java.lang.String getAlias() {
            return this.alias;
        }

        @Override
        public final java.lang.String getBaseUrl() {
            return this.baseUrl;
        }

        @Override
        public final java.lang.String getEnvironment() {
            return this.environment;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("accessId", om.valueToTree(this.getAccessId()));
            data.set("accessKey", om.valueToTree(this.getAccessKey()));
            if (this.getAdminMode() != null) {
                data.set("adminMode", om.valueToTree(this.getAdminMode()));
            }
            if (this.getAlias() != null) {
                data.set("alias", om.valueToTree(this.getAlias()));
            }
            if (this.getBaseUrl() != null) {
                data.set("baseUrl", om.valueToTree(this.getBaseUrl()));
            }
            if (this.getEnvironment() != null) {
                data.set("environment", om.valueToTree(this.getEnvironment()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.provider.SumologicProviderConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SumologicProviderConfig.Jsii$Proxy that = (SumologicProviderConfig.Jsii$Proxy) o;

            if (!accessId.equals(that.accessId)) return false;
            if (!accessKey.equals(that.accessKey)) return false;
            if (this.adminMode != null ? !this.adminMode.equals(that.adminMode) : that.adminMode != null) return false;
            if (this.alias != null ? !this.alias.equals(that.alias) : that.alias != null) return false;
            if (this.baseUrl != null ? !this.baseUrl.equals(that.baseUrl) : that.baseUrl != null) return false;
            return this.environment != null ? this.environment.equals(that.environment) : that.environment == null;
        }

        @Override
        public final int hashCode() {
            int result = this.accessId.hashCode();
            result = 31 * result + (this.accessKey.hashCode());
            result = 31 * result + (this.adminMode != null ? this.adminMode.hashCode() : 0);
            result = 31 * result + (this.alias != null ? this.alias.hashCode() : 0);
            result = 31 * result + (this.baseUrl != null ? this.baseUrl.hashCode() : 0);
            result = 31 * result + (this.environment != null ? this.environment.hashCode() : 0);
            return result;
        }
    }
}
