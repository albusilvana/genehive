define({
    "root": {
        common: {
            add: 'The {0} has been added successfully.',
            updateSuccess: 'The {0} has been updated successfully.',
            updateFail: 'The {0} has not been saved. An error occurred.',
            deleteSuccess: 'The {0} has been deleted.',
            deleteFail: 'The {0} has not been deleted. An error occurred.',
            processingFail: 'The processing engine has not being started. An error occurred.',
            expiredError: 'The {0} could not be expired. An error occurred.',
            expiredSuccess: 'The {0} has been successfully expired.',
            deletionNotAllowed: 'The Licensor Subagreement could not be removed because it is in use in Customer Bundles.',
            nextStepNotAllowedInvoice: 'Please select a customer that has invoices in order to go to the next step.',
            nextStepNotAllowedAdjustments: 'Please select a invoice in order to go to the next step.',
            nextStepNotAllowedBundle: 'Please select a licensor Subagreement in order to go to the next step.',
            nextStepNotAllowedAddPublication: 'Please select a publication in order to go to the next step.',
            updatePriceNotAllowed: 'The price must have 2 decimal points.',
            updatePriceIncorrectFromat: 'The price must be positive and have 2 decimal points.',
            updateRequestNotSent: 'You must change at least one price in order to proceed.',
            updateRequestIncorrect: 'The publications were not updated because at least one price was incorrect. The price must be positive and have 2 decimal points.',
            updatePriceSuccess: 'The price for the publication has been successfully updated.',
            updatePublicationsProcesSuccess: 'The price for the desired publications has been successfully updated.',
            updatePublicationsProcesError: 'The price for the desired publications could not be changed.',
            nextStepNotAllowedAddBundleSubagreement: 'Please fill in the price for all publications in order to go to the next step.',
            nextStepNotAllowedAddBundleToAgreement: 'Please select a priced bundle from the table.',
            linkBundleToCustomerAgreementSuccess: 'The bundle has been successfully added to the customer agreement.',
            linkBundleToCustomerAgreementError: 'The bundle could not be added to the customer agreement because it does not have the same currency as the other bundles.',
            recordedAdjustmentSuccess: 'You have successfully recorded the adjustment.',
            updateNothingChanged: 'You must change something in order for the payment to be updated.',
            invoiceAlreadyPaidAdjustments: 'You can not record adjustments for this invoice because it has already been paid.',
            timeframeChangeSuccess: 'You have successfully changed the time frame.',
            nextStepNotAllowed: 'Please select a {0} from the table in order to go to the next level.',
            generalMessageSuccess: 'The operation completed with success.',
            generalMessageFail: "The operation could not be processed. An error occurred."
        },
        licensors: {
            licensor: {
                name: 'Licensor Name:',
                id: 'Licensor Id:'
            },
            agreement: {
                'name': 'Licensor Agreement Name:',
                'id': 'Licensor Agreement Id:',
                'effDate': 'Effective Date:',
                'expDate': 'Expiry Date:',
                'comment': 'Comment:'
            },

            publication: {
                name: 'Publication Name',
                id: 'Publication Id:',
                price: 'Publication price ($)',
                action: 'Action',
                channel: 'Channel',
                pCode: 'Licensor Source id'
            }
        }
    }
});