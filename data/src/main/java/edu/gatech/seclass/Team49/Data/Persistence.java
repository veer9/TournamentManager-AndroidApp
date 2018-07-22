package edu.gatech.seclass.Team49.Data;

public class Persistence
{
    private static IPersistence instance;
    public static IPersistence GetInstance()
    {
        return instance;
    }

    public static void Initialize(IPersistence persistence) throws Exception
    {
        if(instance != null)
            throw new Exception("Persistence already initialized.");

        instance = persistence;
    }
}
