package com.sumologic.cse_match_list;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.757Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseMatchList.CseMatchListItems")
@software.amazon.jsii.Jsii.Proxy(CseMatchListItems.Jsii$Proxy.class)
public interface CseMatchListItems extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_list#description CseMatchList#description}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDescription();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_list#value CseMatchList#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_list#expiration CseMatchList#expiration}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getExpiration() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseMatchListItems}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseMatchListItems}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseMatchListItems> {
        java.lang.String description;
        java.lang.String value;
        java.lang.String expiration;

        /**
         * Sets the value of {@link CseMatchListItems#getDescription}
         * @param description Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_list#description CseMatchList#description}. This parameter is required.
         * @return {@code this}
         */
        public Builder description(java.lang.String description) {
            this.description = description;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchListItems#getValue}
         * @param value Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_list#value CseMatchList#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link CseMatchListItems#getExpiration}
         * @param expiration Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_match_list#expiration CseMatchList#expiration}.
         * @return {@code this}
         */
        public Builder expiration(java.lang.String expiration) {
            this.expiration = expiration;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseMatchListItems}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseMatchListItems build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseMatchListItems}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseMatchListItems {
        private final java.lang.String description;
        private final java.lang.String value;
        private final java.lang.String expiration;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.description = software.amazon.jsii.Kernel.get(this, "description", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.expiration = software.amazon.jsii.Kernel.get(this, "expiration", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.description = java.util.Objects.requireNonNull(builder.description, "description is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
            this.expiration = builder.expiration;
        }

        @Override
        public final java.lang.String getDescription() {
            return this.description;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getExpiration() {
            return this.expiration;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("description", om.valueToTree(this.getDescription()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getExpiration() != null) {
                data.set("expiration", om.valueToTree(this.getExpiration()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseMatchList.CseMatchListItems"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseMatchListItems.Jsii$Proxy that = (CseMatchListItems.Jsii$Proxy) o;

            if (!description.equals(that.description)) return false;
            if (!value.equals(that.value)) return false;
            return this.expiration != null ? this.expiration.equals(that.expiration) : that.expiration == null;
        }

        @Override
        public final int hashCode() {
            int result = this.description.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.expiration != null ? this.expiration.hashCode() : 0);
            return result;
        }
    }
}
