define({
    "root": {
        common: {
            publication: {
                name: 'Publication Name: ',
                licensorPublicationName: 'Licensor Publication Name: ',
                id: 'Publication Id: ',
                price: 'Publication price ($): ',
                action: 'Action: ',
                channel: 'Channel: ',
                pCode: 'Licensor source id: '
            }
        },
        licensors: {
            licensor: {
                name: 'Licensor Name: ',
                id: 'Licensor Id: '
            },
            agreement: {
                name: 'Agreement Name: ',
                id: 'Agreement Id: ',
                effDate: 'Effective Date: ',
                expDate: 'Expiry Date: ',
                comment: 'Comment: '
            },
            subagreement: {
                name: 'Subagreement Name: ',
                id: 'Subagreement Id: ',
                fee: 'Access Fee: ',
                splitRatio: 'Split Ratio: ',
                paymentCycle: 'Payment Cycle: ',
                effDate: 'Effective Date: ',
                expDate: 'Expiry Date: '
            }
        },
        customers: {
            customer: {
                name: 'Customer Name:',
                id: 'Customer Id: ',
                isMme: 'Is MME: ',
                isActive: 'Is active: '
            },
            agreement: {
                name: 'Agreement Name: ',
                id: 'Agreement Id: ',
                effDate: 'Effective Date: ',
                expDate: 'Expiry Date: ',
                comment: 'Comment: ',
                currency: 'Currency: '
            },

            bundle: {
                id: 'Bundle Id: ',
                name: 'Bundle Name: ',
                effDate: 'Effective Date: ',
                expDate: 'Expiry Date: ',
                version: 'Version: '
            }
        }
    }
});