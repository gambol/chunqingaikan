package com.j256.ormlite.dao; class DaoManager$TableConfigConnectionSource { void a() { int a;
a=0;// .class Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DaoManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/j256/ormlite/dao/DaoManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "TableConfigConnectionSource"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;// .field tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lcom/j256/ormlite/support/ConnectionSource;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;//     .locals 0
a=0;//     .param p1, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 429
a=0;//     .local p2, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 430
a=0;//     #p0=(Reference,Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     .line 431
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     .line 432
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 4
a=0;//     .param p1, "obj"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 442
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 451
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/lang/Class;);v3=(Reference,Ljava/lang/Class;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 445
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;// 
a=0;//     .line 446
a=0;//     .local v0, "other":Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     iget-object v3, v0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 448
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     iget-object v3, v0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 451
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     const/16 v0, 0x1f
a=0;// 
a=0;//     .line 436
a=0;//     .local v0, "prime":I
a=0;//     #v0=(PosByte);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->tableConfig:Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v2=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v1, v2, 0x1f
a=0;// 
a=0;//     .line 437
a=0;//     .local v1, "result":I
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v2, v1, 0x1f
a=0;// 
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/dao/DaoManager$TableConfigConnectionSource;->connectionSource:Lcom/j256/ormlite/support/ConnectionSource;
a=0;// 
a=0;//     #v3=(Reference,Lcom/j256/ormlite/support/ConnectionSource;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int v1, v2, v3
a=0;// 
a=0;//     .line 438
a=0;//     return v1
a=0;// .end method
}}
