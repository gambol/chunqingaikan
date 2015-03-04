package com.j256.ormlite.misc; class BaseDaoEnabled { void a() { int a;
a=0;// .class public abstract Lcom/j256/ormlite/misc/BaseDaoEnabled;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseDaoEnabled.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "ID:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected transient dao:Lcom/j256/ormlite/dao/Dao;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkForDao()V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Dao has not been set on "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " object: "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 135
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public create()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 36
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 37
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/dao/Dao;->create(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public delete()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 76
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 77
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/dao/Dao;->delete(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public extractId()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TID;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 100
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/dao/Dao;->extractId(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public getDao()Lcom/j256/ormlite/dao/Dao;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public objectToString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     :try_start_0
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 90
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .line 91
a=0;//     .local v1, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v1=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v2, v1}, Lcom/j256/ormlite/dao/Dao;->objectToString(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 86
a=0;//     .end local v1    # "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 87
a=0;//     .local v0, "e":Ljava/sql/SQLException;
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public objectsEqual(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     .local p1, "other":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 110
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 111
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0, p1}, Lcom/j256/ormlite/dao/Dao;->objectsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public refresh()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 46
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/dao/Dao;->refresh(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public setDao(Lcom/j256/ormlite/dao/Dao;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/dao/Dao",
a=0;//             "<TT;TID;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     .local p1, "dao":Lcom/j256/ormlite/dao/Dao;, "Lcom/j256/ormlite/dao/Dao<TT;TID;>;"
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public update()I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 56
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0}, Lcom/j256/ormlite/dao/Dao;->update(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public updateId(Ljava/lang/Object;)I
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TID;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     .local p0, "this":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "Lcom/j256/ormlite/misc/BaseDaoEnabled<TT;TID;>;"
a=0;//     .local p1, "newId":Ljava/lang/Object;, "TID;"
a=0;//     invoke-direct {p0}, Lcom/j256/ormlite/misc/BaseDaoEnabled;->checkForDao()V
a=0;// 
a=0;//     .line 66
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "t":Lcom/j256/ormlite/misc/BaseDaoEnabled;, "TT;"
a=0;//     #v0=(Reference,Lcom/j256/ormlite/misc/BaseDaoEnabled;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/misc/BaseDaoEnabled;->dao:Lcom/j256/ormlite/dao/Dao;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/dao/Dao;);
a=0;//     invoke-interface {v1, v0, p1}, Lcom/j256/ormlite/dao/Dao;->updateId(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
}}
