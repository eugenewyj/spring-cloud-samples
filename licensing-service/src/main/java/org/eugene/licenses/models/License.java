package org.eugene.licenses.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class License {
    private String id;
    private String organizationId;
    private String productName;
    private String licenseType;
    private String comment;

    public License withId(String id) {
        this.setId(id);
        return this;
    }

    public License withOrganizationId(String organizationId) {
        this.setOrganizationId(organizationId);
        return this;
    }

    public License withProductName(String productName) {
        this.setProductName(productName);
        return this;
    }

    public License withLicenseType(String licenseType) {
        this.setLicenseType(licenseType);
        return this;
    }

    public License withComment(String comment) {
        this.setComment(comment);
        return this;
    }
}
