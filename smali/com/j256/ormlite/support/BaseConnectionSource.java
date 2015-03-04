package com.j256.ormlite.support; class BaseConnectionSource { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/support/BaseConnectionSource;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseConnectionSource.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private specialConnection:Ljava/lang/ThreadLocal;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ThreadLocal",
a=0;//             "<",
a=0;//             "Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/j256/ormlite/support/BaseConnectionSource;);
a=0;//     new-instance v0, Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ThreadLocal;);
a=0;//     invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     iput-object v0, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected clearSpecial(Lcom/j256/ormlite/support/DatabaseConnection;Lcom/j256/ormlite/logger/Logger;)Z
a=0;//     .locals 4
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .param p2, "logger"    # Lcom/j256/ormlite/logger/Logger;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// 
a=0;//     .line 81
a=0;//     .local v1, "currentSaved":Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "cleared":Z
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/ThreadLocal;);v3=(Uninit);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     const-string v2, "no connection has been saved when clear() called"
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 86
a=0;//     :cond_1
a=0;//     iget-object v2, v1, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     if-ne v2, p1, :cond_3
a=0;// 
a=0;//     .line 87
a=0;//     invoke-virtual {v1}, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->decrementAndGet()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 91
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_3
a=0;//     #v0=(Null);v2=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);v3=(Uninit);
a=0;//     const-string v2, "connection saved {} is not the one being cleared {}"
a=0;// 
a=0;//     iget-object v3, v1, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/DatabaseConnection;);
a=0;//     invoke-virtual {p2, v2, v3, p1}, Lcom/j256/ormlite/logger/Logger;->error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected getSavedConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// 
a=0;//     .line 30
a=0;//     .local v0, "nested":Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getSpecialConnection()Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// 
a=0;//     .line 18
a=0;//     .local v0, "currentSaved":Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 19
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 21
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v1, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected isSavedConnection(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     .locals 3
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 41
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "currentSaved":Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 48
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     iget-object v2, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     if-ne v2, p1, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected saveSpecial(Lcom/j256/ormlite/support/DatabaseConnection;)Z
a=0;//     .locals 4
a=0;//     .param p1, "connection"    # Lcom/j256/ormlite/support/DatabaseConnection;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);
a=0;//     invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// 
a=0;//     .line 60
a=0;//     .local v0, "currentSaved":Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/support/BaseConnectionSource;->specialConnection:Ljava/lang/ThreadLocal;
a=0;// 
a=0;//     new-instance v2, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;);
a=0;//     invoke-direct {v2, p1}, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;-><init>(Lcom/j256/ormlite/support/DatabaseConnection;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 62
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 70
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/lang/ThreadLocal;);v2=(Uninit);
a=0;//     iget-object v1, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     if-eq v1, p1, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "trying to save connection "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " but already have saved connection "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, v0, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->connection:Lcom/j256/ormlite/support/DatabaseConnection;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 69
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {v0}, Lcom/j256/ormlite/support/BaseConnectionSource$NestedConnection;->increment()V
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
