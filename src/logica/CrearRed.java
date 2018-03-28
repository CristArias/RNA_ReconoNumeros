/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import org.joone.engine.FullSynapse;
import org.joone.engine.LinearLayer;
import org.joone.engine.NeuralNetEvent;
import org.joone.engine.NeuralNetListener;
import org.joone.engine.SigmoidLayer;
import org.joone.net.NeuralNet;

/**
 *
 * @author CristianAG
 */
public class CrearRed implements NeuralNetListener {
    
    LinearLayer input = new LinearLayer();
    SigmoidLayer hidden = new SigmoidLayer();
    SigmoidLayer output = new SigmoidLayer();
    
    public void Go(String inputFile, String outputFile) {
        /*
         * Firts, creates the three Layers
         */
        
        input.setLayerName("input");
        hidden.setLayerName("hidden");
        output.setLayerName("output");
        /* sets their dimensions */
        input.setRows(2);
        hidden.setRows(3);
        output.setRows(1);
        
        /*
         * Now create the two Synapses
         */
        FullSynapse synapse_IH = new FullSynapse(); /* input -> hidden conn. */
        FullSynapse synapse_HO = new FullSynapse(); /* hidden -> output conn. */
        
        synapse_IH.setName("IH");
        synapse_HO.setName("HO");
        
    }
      
    
    public NeuralNet creaNnet()
    {
        NeuralNet nnet = new NeuralNet();
        
        nnet.addLayer(input, NeuralNet.INPUT_LAYER);
        nnet.addLayer(hidden, NeuralNet.HIDDEN_LAYER);
        nnet.addLayer(output, NeuralNet.OUTPUT_LAYER);
        
        return nnet;
        
    }
    

    @Override
    public void netStarted(NeuralNetEvent nne) {
       
    }

    @Override
    public void cicleTerminated(NeuralNetEvent nne) {
        
    }

    @Override
    public void netStopped(NeuralNetEvent nne) {
        
    }

    @Override
    public void errorChanged(NeuralNetEvent nne) {
        
    }

    @Override
    public void netStoppedError(NeuralNetEvent nne, String string) {
        
    }
    
}
