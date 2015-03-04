package com.lidroid.xutils.http.client.multipart; class MinimalFieldHeader { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MinimalFieldHeader.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Iterable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Iterable",
a=0;//         "<",
a=0;//         "Lcom/lidroid/xutils/http/client/multipart/MinimalField;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final fieldMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/MinimalField;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final fields:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/MinimalField;",
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
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     new-instance v0, Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     .line 31
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;)V
a=0;//     .locals 4
a=0;//     .param p1, "field"    # Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 46
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 38
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 39
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 40
a=0;//     .local v1, "values":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     new-instance v1, Ljava/util/LinkedList;
a=0;// 
a=0;//     .end local v1    # "values":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     #v1=(UninitRef,Ljava/util/LinkedList;);
a=0;//     invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V
a=0;// 
a=0;//     .line 42
a=0;//     .restart local v1    # "values":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     #v1=(Reference,Ljava/util/LinkedList;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 45
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getField(Ljava/lang/String;)Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     .locals 4
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 53
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalField;);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 56
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 58
a=0;//     .local v1, "list":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getFields()Ljava/util/List;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/MinimalField;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getFields(Ljava/lang/String;)Ljava/util/List;
a=0;//     .locals 3
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/MinimalField;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 66
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ujava/lang/Object;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 70
a=0;//     .local v1, "list":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/MinimalField;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public removeFields(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 78
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {p1, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/List;
a=0;// 
a=0;//     .line 83
a=0;//     .local v1, "removed":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 87
a=0;//     invoke-interface {v1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;)V
a=0;//     .locals 8
a=0;//     .param p1, "field"    # Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 114
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/Locale;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 95
a=0;//     .local v4, "key":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fieldMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/util/List;
a=0;// 
a=0;//     .line 96
a=0;//     .local v5, "list":Ljava/util/List;, "Ljava/util/List<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->addField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_2
a=0;//     #v6=(Boolean);
a=0;//     invoke-interface {v5}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 101
a=0;//     invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 103
a=0;//     .local v1, "firstOccurrence":I
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 104
a=0;//     .local v2, "index":I
a=0;//     #v2=(Null);
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .local v3, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Lcom/lidroid/xutils/http/client/multipart/MinimalField;>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v6, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_3
a=0;//     #v6=(Boolean);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "f":Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     invoke-virtual {v0}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 107
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     .line 108
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v1, v6, :cond_4
a=0;// 
a=0;//     .line 109
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 104
a=0;//     :cond_4
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 122
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->fields:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
