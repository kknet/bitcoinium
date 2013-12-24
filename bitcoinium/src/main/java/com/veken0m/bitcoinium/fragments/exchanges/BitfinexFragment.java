
package com.veken0m.bitcoinium.fragments.exchanges;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.veken0m.bitcoinium.R;
import com.veken0m.bitcoinium.fragments.BaseExchangeFragment;
import com.xeiam.xchange.bitfinex.v1.service.BitfinexAuthHelper;

public class BitfinexFragment extends BaseExchangeFragment {

    public BitfinexFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        buildMenu(view, BITFINEX, true);
        try {
            BitfinexAuthHelper.installCerts();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

}
