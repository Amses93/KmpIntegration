//
//  ContentView.swift
//  KmpIntegrationIOS
//
//  Created by Amel Curic on 2025-06-19.
//

import SwiftUI
import lib_a_shared
import lib_b_shared

struct ContentView: View {
    var body: some View {
        VStack {
			Spacer()
			Text(SharedClassA().getClassName())
			Spacer()
			Text(SharedClassB().getClassName())
			Spacer()
        }
        .padding()
    }
}

#Preview {
    ContentView()
}
