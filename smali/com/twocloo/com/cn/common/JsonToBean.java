package com.twocloo.com.cn.common; class JsonToBean { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/common/JsonToBean;
a=0;// .super Ljava/lang/Object;
a=0;// .source "JsonToBean.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/common/JsonToBean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToAboutme(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/CallQQ;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 568
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 601
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/CallQQ;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 570
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/CallQQ;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/CallQQ;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/CallQQ;-><init>()V
a=0;// 
a=0;//     .line 572
a=0;//     .local v1, "cq":Lcom/twocloo/com/cn/beans/CallQQ;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/CallQQ;);
a=0;//     const-string v7, "tel"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 573
a=0;//     const-string v7, "tel"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 574
a=0;//     .local v5, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v5=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 575
a=0;//     .local v0, "buffer":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v2, "\u3001"
a=0;// 
a=0;//     .line 576
a=0;//     .local v2, "d":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);v6=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v4, v7, :cond_3
a=0;// 
a=0;//     .line 582
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/CallQQ;->setCall(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 584
a=0;//     .end local v0    # "buffer":Ljava/lang/StringBuffer;
a=0;//     .end local v2    # "d":Ljava/lang/String;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     const-string v7, "qq"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 585
a=0;//     const-string v7, "qq"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 586
a=0;//     .restart local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     #v5=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v0, Ljava/lang/StringBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuffer;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V
a=0;// 
a=0;//     .line 587
a=0;//     .restart local v0    # "buffer":Ljava/lang/StringBuffer;
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);
a=0;//     const-string v2, "\u3001"
a=0;// 
a=0;//     .line 588
a=0;//     .restart local v2    # "d":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .restart local v4    # "i":I
a=0;//     :goto_2
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v4, v7, :cond_5
a=0;// 
a=0;//     .line 594
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/CallQQ;->setQq(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 597
a=0;//     .end local v0    # "buffer":Ljava/lang/StringBuffer;
a=0;//     .end local v2    # "d":Ljava/lang/String;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 598
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 577
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "buffer":Ljava/lang/StringBuffer;
a=0;//     .restart local v2    # "d":Ljava/lang/String;
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/StringBuffer;);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Integer);v5=(Reference,Lorg/json/JSONArray;);v7=(Integer);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     if-ne v4, v7, :cond_4
a=0;// 
a=0;//     .line 578
a=0;//     const-string v2, " "
a=0;// 
a=0;//     .line 579
a=0;//     :cond_4
a=0;//     invoke-virtual {v5, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 580
a=0;//     .local v6, "obj":Ljava/lang/Object;
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;// 
a=0;//     .line 576
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 589
a=0;//     .end local v6    # "obj":Ljava/lang/Object;
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);v7=(Integer);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     add-int/lit8 v7, v7, -0x1
a=0;// 
a=0;//     if-ne v4, v7, :cond_6
a=0;// 
a=0;//     .line 590
a=0;//     const-string v2, " "
a=0;// 
a=0;//     .line 591
a=0;//     :cond_6
a=0;//     invoke-virtual {v5, v4}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 592
a=0;//     .restart local v6    # "obj":Ljava/lang/Object;
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 588
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToBKList(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/NewBookList;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 360
a=0;//     #v7=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 407
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/NewBookList;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 363
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/NewBookList;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/NewBookList;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/NewBookList;-><init>()V
a=0;// 
a=0;//     .line 364
a=0;//     .local v0, "bk":Lcom/twocloo/com/cn/beans/NewBookList;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/NewBookList;);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 366
a=0;//     .local v6, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/NewBook;>;"
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v8, "info"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 367
a=0;//     const-string v8, "info"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 368
a=0;//     .local v5, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v5=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v3, v8, :cond_4
a=0;// 
a=0;//     .line 395
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/NewBookList;->setBklist(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 396
a=0;//     const-string v8, "total_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 397
a=0;//     const-string v8, "total_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v0, v8}, Lcom/twocloo/com/cn/beans/NewBookList;->setBkcount(I)V
a=0;// 
a=0;//     .line 399
a=0;//     :cond_3
a=0;//     const-string v8, "cur_page_num"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 400
a=0;//     const-string v8, "cur_page_num"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v0, v8}, Lcom/twocloo/com/cn/beans/NewBookList;->setCurpage(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 403
a=0;//     :catch_0
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 404
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v0, v7
a=0;// 
a=0;//     .line 407
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 369
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/NewBookList;);v2=(Uninit);v3=(Integer);v5=(Reference,Lorg/json/JSONArray;);v8=(Integer);
a=0;//     invoke-virtual {v5, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 370
a=0;//     .local v4, "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/NewBook;-><init>()V
a=0;// 
a=0;//     .line 371
a=0;//     .local v1, "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     const-string v8, "totalviews"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 372
a=0;//     const-string v8, "totalviews"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setTotalviews(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 374
a=0;//     :cond_5
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "articleid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_6
a=0;// 
a=0;//     .line 375
a=0;//     const-string v8, "articleid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 377
a=0;//     :cond_6
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "title"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 378
a=0;//     const-string v8, "title"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 380
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "author"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     .line 381
a=0;//     const-string v8, "author"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 383
a=0;//     :cond_8
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "finishflag"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_9
a=0;// 
a=0;//     .line 384
a=0;//     const-string v8, "finishflag"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setFinishflag(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 386
a=0;//     :cond_9
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "sortname"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_a
a=0;// 
a=0;//     .line 387
a=0;//     const-string v8, "sortname"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setSortname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 389
a=0;//     :cond_a
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "imagefname"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_b
a=0;// 
a=0;//     .line 390
a=0;//     const-string v8, "imagefname"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Lcom/twocloo/com/cn/beans/NewBook;->setImgURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 392
a=0;//     :cond_b
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 368
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToBanbenxinxi(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 818
a=0;//     #v1=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 879
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/Banbenxinxi;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 821
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/Banbenxinxi;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/Banbenxinxi;-><init>()V
a=0;// 
a=0;//     .line 824
a=0;//     .local v1, "bbxx":Lcom/twocloo/com/cn/beans/Banbenxinxi;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Banbenxinxi;);
a=0;//     const-string v6, "is_exist_newversion"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 825
a=0;//     const-string v6, "is_exist_newversion"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "1"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 827
a=0;//     const-string v6, "url"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 828
a=0;//     const-string v6, "url"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setAppurl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 829
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setVersion(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 830
a=0;//     const v6, 0x7fffffff
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setVersionCode(I)V
a=0;// 
a=0;//     .line 831
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     new-array v6, v6, [Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const-string v8, "\u53d1\u73b0\u65b0\u7248\u672c"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     aput-object v8, v6, v7
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setFeatures([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 832
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setUpdatetime(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 833
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setWrongversion([I)V
a=0;// 
a=0;//     .line 838
a=0;//     :cond_2
a=0;//     #v6=(Boolean);v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v6, "version"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 839
a=0;//     const-string v6, "version"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setVersion(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 841
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "versionCode"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 842
a=0;//     const-string v6, "versionCode"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setVersionCode(I)V
a=0;// 
a=0;//     .line 844
a=0;//     :cond_4
a=0;//     const-string v6, "update_time"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 845
a=0;//     const-string v6, "update_time"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setUpdatetime(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 847
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "appurl"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     .line 848
a=0;//     const-string v6, "appurl"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setAppurl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 850
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "new_features"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 851
a=0;//     const-string v6, "new_features"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 852
a=0;//     .local v3, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v0, v6, [Ljava/lang/String;
a=0;// 
a=0;//     .line 853
a=0;//     .local v0, "a":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v2, v6, :cond_9
a=0;// 
a=0;//     .line 857
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setFeatures([Ljava/lang/String;)V
a=0;// 
a=0;//     .line 860
a=0;//     .end local v0    # "a":[Ljava/lang/String;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v6, "isforce"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     .line 861
a=0;//     const-string v6, "isforce"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {v1, v6}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setIsforce(Z)V
a=0;// 
a=0;//     .line 863
a=0;//     :cond_8
a=0;//     const-string v6, "wrongversion"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 865
a=0;//     const-string v6, "wrongversion"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 867
a=0;//     .restart local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     new-array v5, v6, [I
a=0;// 
a=0;//     .line 869
a=0;//     .local v5, "wrongarray":[I
a=0;//     #v5=(Reference,[I);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "i":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-lt v2, v6, :cond_a
a=0;// 
a=0;//     .line 873
a=0;//     invoke-virtual {v1, v5}, Lcom/twocloo/com/cn/beans/Banbenxinxi;->setWrongversion([I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 876
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     .end local v5    # "wrongarray":[I
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v6
a=0;// 
a=0;//     #v6=(Reference,Lorg/json/JSONException;);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 854
a=0;//     .restart local v0    # "a":[Ljava/lang/String;
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_9
a=0;//     #v0=(Reference,[Ljava/lang/String;);v2=(Integer);v3=(Reference,Lorg/json/JSONArray;);v5=(Uninit);v6=(Integer);
a=0;//     invoke-virtual {v3, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 855
a=0;//     .local v4, "obj":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v0, v2
a=0;// 
a=0;//     .line 853
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 870
a=0;//     .end local v0    # "a":[Ljava/lang/String;
a=0;//     .end local v4    # "obj":Ljava/lang/String;
a=0;//     .restart local v5    # "wrongarray":[I
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Reference,[I);v6=(Integer);
a=0;//     invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getInt(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 871
a=0;//     .local v4, "obj":I
a=0;//     #v4=(Integer);
a=0;//     aput v4, v5, v2
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 869
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToBusiness(Ljava/lang/String;)[Ljava/lang/Object;
a=0;//     .locals 10
a=0;//     .param p0, "json"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1489
a=0;//     #v8=(Null);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1490
a=0;//     .local v5, "list1":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1492
a=0;//     .local v6, "list2":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/json/JSONArray;);
a=0;//     invoke-direct {v4, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1493
a=0;//     .local v4, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v4=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1494
a=0;//     .local v2, "ja":Lorg/json/JSONArray;
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "j":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v1, v7, :cond_0
a=0;// 
a=0;//     .line 1497
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v4, v7}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1498
a=0;//     .local v3, "ja2":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v1, v7, :cond_1
a=0;// 
a=0;//     .line 1504
a=0;//     .end local v1    # "j":I
a=0;//     .end local v2    # "ja":Lorg/json/JSONArray;
a=0;//     .end local v3    # "ja2":Lorg/json/JSONArray;
a=0;//     .end local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     new-array v7, v7, [Ljava/lang/Object;
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     aput-object v5, v7, v8
a=0;// 
a=0;//     aput-object v6, v7, v9
a=0;// 
a=0;//     return-object v7
a=0;// 
a=0;//     .line 1495
a=0;//     .restart local v1    # "j":I
a=0;//     .restart local v2    # "ja":Lorg/json/JSONArray;
a=0;//     .restart local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Reference,Lorg/json/JSONArray;);v3=(Uninit);v4=(Reference,Lorg/json/JSONArray;);v7=(Integer);
a=0;//     invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1494
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1499
a=0;//     .restart local v3    # "ja2":Lorg/json/JSONArray;
a=0;//     :cond_1
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);v7=(Integer);
a=0;//     invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 1498
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1501
a=0;//     .end local v1    # "j":I
a=0;//     .end local v2    # "ja":Lorg/json/JSONArray;
a=0;//     .end local v3    # "ja2":Lorg/json/JSONArray;
a=0;//     .end local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1502
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToFenleiList(Lorg/json/JSONObject;)Ljava/util/ArrayList;
a=0;//     .locals 8
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BookType;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 289
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 292
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 294
a=0;//     .local v5, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/BookType;>;"
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 295
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 296
a=0;//     .local v4, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v4=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v2, v7, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     invoke-virtual {v4, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 298
a=0;//     .local v3, "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/BookType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/BookType;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/BookType;-><init>()V
a=0;// 
a=0;//     .line 299
a=0;//     .local v0, "btype":Lcom/twocloo/com/cn/beans/BookType;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/BookType;);
a=0;//     const-string v7, "sort_id"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 300
a=0;//     const-string v7, "sort_id"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/BookType;->setSortId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 302
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 303
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/BookType;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 305
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 296
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 310
a=0;//     .end local v0    # "btype":Lcom/twocloo/com/cn/beans/BookType;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "jobj":Lorg/json/JSONObject;
a=0;//     .end local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 311
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v7=(Conflicted);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 313
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToImageList(Lorg/json/JSONObject;)Ljava/util/ArrayList;
a=0;//     .locals 8
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/Image;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 411
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v3, v6
a=0;// 
a=0;//     .line 435
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/ArrayList;);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 414
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 417
a=0;//     .local v3, "imgList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Image;>;"
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v7, "img"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 418
a=0;//     const-string v7, "img"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 419
a=0;//     .local v5, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v5=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v1, v7, :cond_0
a=0;// 
a=0;//     .line 420
a=0;//     invoke-virtual {v5, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 421
a=0;//     .local v4, "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v2, Lcom/twocloo/com/cn/beans/Image;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/beans/Image;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/beans/Image;-><init>()V
a=0;// 
a=0;//     .line 422
a=0;//     .local v2, "img":Lcom/twocloo/com/cn/beans/Image;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/Image;);
a=0;//     const-string v7, "img"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 423
a=0;//     const-string v7, "img"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/Image;->setImageURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 425
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "order"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 426
a=0;//     const-string v7, "order"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/Image;->setOrder(I)V
a=0;// 
a=0;//     .line 428
a=0;//     :cond_3
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 419
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 432
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "img":Lcom/twocloo/com/cn/beans/Image;
a=0;//     .end local v4    # "jobj":Lorg/json/JSONObject;
a=0;//     .end local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 433
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v3, v6
a=0;// 
a=0;//     .line 435
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToMonth(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Month;
a=0;//     .locals 8
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1283
a=0;//     #v2=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 1302
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/Month;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1288
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/Month;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/Month;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/Month;-><init>()V
a=0;// 
a=0;//     .line 1289
a=0;//     .local v1, "month":Lcom/twocloo/com/cn/beans/Month;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Month;);
a=0;//     const-string v3, "code"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 1290
a=0;//     const-string v3, "code"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/Month;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1292
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "month_status"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 1293
a=0;//     const-string v3, "month_status"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/Month;->setMonth_status(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1295
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "date"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1296
a=0;//     new-instance v3, Ljava/sql/Date;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/sql/Date;);
a=0;//     const-string v4, "date"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     const-wide/16 v6, 0x3e8
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     mul-long/2addr v4, v6
a=0;// 
a=0;//     invoke-direct {v3, v4, v5}, Ljava/sql/Date;-><init>(J)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/sql/Date;);
a=0;//     invoke-virtual {v1, v3}, Lcom/twocloo/com/cn/beans/Month;->setDate(Ljava/sql/Date;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1298
a=0;//     .end local v1    # "month":Lcom/twocloo/com/cn/beans/Month;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1299
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 1300
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToNewBookList(Lorg/json/JSONObject;)Ljava/util/ArrayList;
a=0;//     .locals 8
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/NewBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 317
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 356
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ljava/util/ArrayList;);v7=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 320
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 322
a=0;//     .local v5, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/NewBook;>;"
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 323
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 324
a=0;//     .local v4, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v4=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v2, v7, :cond_0
a=0;// 
a=0;//     .line 325
a=0;//     invoke-virtual {v4, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 326
a=0;//     .local v3, "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/NewBook;-><init>()V
a=0;// 
a=0;//     .line 327
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     const-string v7, "totalviews"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 328
a=0;//     const-string v7, "totalviews"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setTotalviews(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 330
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 331
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 333
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 334
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 336
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 337
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 340
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setFinishflag(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "sortname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 343
a=0;//     const-string v7, "sortname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setSortname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 345
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "imagefname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 346
a=0;//     const-string v7, "imagefname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v7}, Lcom/twocloo/com/cn/beans/NewBook;->setImgURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 348
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 324
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 352
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "jobj":Lorg/json/JSONObject;
a=0;//     .end local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 353
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v7=(Conflicted);
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 356
a=0;//     #v5=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToOrderAll(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 460
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 505
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/OrderAllMsg;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 463
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/OrderAllMsg;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/OrderAllMsg;-><init>()V
a=0;// 
a=0;//     .line 465
a=0;//     .local v1, "all":Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/OrderAllMsg;);
a=0;//     const-string v7, "remain"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 466
a=0;//     const-string v7, "remain"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setRemain(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 468
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 469
a=0;//     const-string v7, "price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setPrice(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 471
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "chapter_info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 472
a=0;//     const-string v7, "chapter_info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 474
a=0;//     .local v5, "j":Lorg/json/JSONObject;
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "total_price"
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 475
a=0;//     const-string v7, "total_price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setTotal_price(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 477
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "total_vip_word"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 478
a=0;//     const-string v7, "total_vip_word"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setTotal_vip_word(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 480
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "total_chapter"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 481
a=0;//     const-string v7, "total_chapter"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setTotal_chapter(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 483
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "need_sub_chapter_id_list"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 484
a=0;//     const-string v7, "need_sub_chapter_id_list"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 485
a=0;//     .local v2, "arr":Lorg/json/JSONArray;
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 486
a=0;//     .local v0, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v4, v7, :cond_9
a=0;// 
a=0;//     .line 489
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setChapterList(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 493
a=0;//     .end local v0    # "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .end local v2    # "arr":Lorg/json/JSONArray;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "j":Lorg/json/JSONObject;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v7, "time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 494
a=0;//     const-string v7, "time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setCurtime(J)V
a=0;// 
a=0;//     .line 496
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 497
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setOvertime(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 501
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 502
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 505
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 487
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .restart local v2    # "arr":Lorg/json/JSONArray;
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v5    # "j":Lorg/json/JSONObject;
a=0;//     :cond_9
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Lcom/twocloo/com/cn/beans/OrderAllMsg;);v2=(Reference,Lorg/json/JSONArray;);v3=(Uninit);v4=(Integer);v5=(Reference,Lorg/json/JSONObject;);v7=(Integer);v8=(Uninit);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 486
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToOrderDiscountAll(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 509
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 563
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/OrderAllMsg;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 512
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/OrderAllMsg;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/OrderAllMsg;-><init>()V
a=0;// 
a=0;//     .line 514
a=0;//     .local v1, "all":Lcom/twocloo/com/cn/beans/OrderAllMsg;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/OrderAllMsg;);
a=0;//     const-string v7, "remain"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 515
a=0;//     const-string v7, "remain"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setRemain(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 517
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "totalprice"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 518
a=0;//     const-string v7, "totalprice"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setPrice(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 520
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "discount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 521
a=0;//     const-string v7, "discount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setDiscountCount(F)V
a=0;// 
a=0;//     .line 523
a=0;//     :cond_4
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 524
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setOvertime(J)V
a=0;// 
a=0;//     .line 526
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 527
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setOvertime(J)V
a=0;// 
a=0;//     .line 529
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v7, "chapter_info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     .line 530
a=0;//     const-string v7, "chapter_info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 532
a=0;//     .local v5, "j":Lorg/json/JSONObject;
a=0;//     #v5=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "total_price"
a=0;// 
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 533
a=0;//     const-string v7, "total_price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setTotal_price(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 535
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "total_vip_word"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 536
a=0;//     const-string v7, "total_vip_word"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setTotal_vip_word(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 538
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "total_chapter"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 539
a=0;//     const-string v7, "total_chapter"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setTotal_chapter(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 541
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "need_sub_chapter_id_list"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     .line 542
a=0;//     const-string v7, "need_sub_chapter_id_list"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 543
a=0;//     .local v2, "arr":Lorg/json/JSONArray;
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 544
a=0;//     .local v0, "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v4, v7, :cond_c
a=0;// 
a=0;//     .line 547
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setChapterList(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 551
a=0;//     .end local v0    # "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .end local v2    # "arr":Lorg/json/JSONArray;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "j":Lorg/json/JSONObject;
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v7, "time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_b
a=0;// 
a=0;//     .line 552
a=0;//     const-string v7, "time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setCurtime(J)V
a=0;// 
a=0;//     .line 554
a=0;//     :cond_b
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 555
a=0;//     const-string v7, "expireTime"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v7
a=0;// 
a=0;//     #v7=(LongLo);v8=(LongHi);
a=0;//     invoke-virtual {v1, v7, v8}, Lcom/twocloo/com/cn/beans/OrderAllMsg;->setOvertime(J)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 559
a=0;//     :catch_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 560
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 563
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 545
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     .restart local v0    # "al":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     .restart local v2    # "arr":Lorg/json/JSONArray;
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v5    # "j":Lorg/json/JSONObject;
a=0;//     :cond_c
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);v1=(Reference,Lcom/twocloo/com/cn/beans/OrderAllMsg;);v2=(Reference,Lorg/json/JSONArray;);v3=(Uninit);v4=(Integer);v5=(Reference,Lorg/json/JSONObject;);v7=(Integer);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 544
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToParter(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Parter;
a=0;//     .locals 3
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1309
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/Parter;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/Parter;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/Parter;-><init>()V
a=0;// 
a=0;//     .line 1311
a=0;//     .local v0, "parter":Lcom/twocloo/com/cn/beans/Parter;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Parter;);
a=0;//     const-string v1, "PARTNER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1312
a=0;//     const-string v1, "PARTNER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Parter;->setPARTNER(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1313
a=0;//     const-string v1, "msg"
a=0;// 
a=0;//     const-string v2, "PARTNER"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1315
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "SELLER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1316
a=0;//     const-string v1, "SELLER"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Parter;->setSELLER(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1317
a=0;//     const-string v1, "msg"
a=0;// 
a=0;//     const-string v2, "SELLER"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1319
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "RSA_ALIPAY_PUBLIC"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 1320
a=0;//     const-string v1, "RSA_ALIPAY_PUBLIC"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Parter;->setRSA_ALIPAY_PUBLIC(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1321
a=0;//     const-string v1, "msg"
a=0;// 
a=0;//     const-string v2, "RSA_ALIPAY_PUBLIC"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1323
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const-string v1, "RSA_PRIVATE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 1324
a=0;//     const-string v1, "RSA_PRIVATE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/twocloo/com/cn/beans/Parter;->setRSA_PRIVATE(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1325
a=0;//     const-string v1, "msg"
a=0;// 
a=0;//     const-string v2, "RSA_PRIVATE"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1331
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1327
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToRDBook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     .locals 7
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 710
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 711
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 808
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 713
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/RDBook;-><init>()V
a=0;// 
a=0;//     .line 715
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     const-string v5, "code"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_f
a=0;// 
a=0;//     .line 716
a=0;//     const-string v5, "code"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 747
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v5, "is_discount_book"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 748
a=0;//     const-string v5, "is_discount_book"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setIs_discount_book(I)V
a=0;// 
a=0;//     .line 750
a=0;//     :cond_2
a=0;//     const-string v5, "totalprice"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 753
a=0;//     const-string v5, "totalprice"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(DoubleLo);v6=(DoubleHi);
a=0;//     invoke-virtual {v0, v5, v6}, Lcom/twocloo/com/cn/beans/RDBook;->setTotalprice(D)V
a=0;// 
a=0;//     .line 755
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v5, "is_vip"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     .line 756
a=0;//     const-string v5, "is_vip"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setIsVip(I)V
a=0;// 
a=0;//     .line 758
a=0;//     :cond_4
a=0;//     const-string v5, "displayorder"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     .line 759
a=0;//     const-string v5, "displayorder"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setOrder(I)V
a=0;// 
a=0;//     .line 761
a=0;//     :cond_5
a=0;//     const-string v5, "text_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_6
a=0;// 
a=0;//     .line 762
a=0;//     const-string v5, "text_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setTextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 764
a=0;//     :cond_6
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "text_title"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_7
a=0;// 
a=0;//     .line 765
a=0;//     const-string v5, "text_title"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setTextTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 767
a=0;//     :cond_7
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "word_count"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_8
a=0;// 
a=0;//     .line 768
a=0;//     const-string v5, "word_count"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setWordCount(I)V
a=0;// 
a=0;//     .line 770
a=0;//     :cond_8
a=0;//     const-string v5, "article_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_9
a=0;// 
a=0;//     .line 771
a=0;//     const-string v5, "article_id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setArticleId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 773
a=0;//     :cond_9
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "finishflag"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_a
a=0;// 
a=0;//     .line 774
a=0;//     const-string v5, "finishflag"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setFinishflag(I)V
a=0;// 
a=0;//     .line 776
a=0;//     :cond_a
a=0;//     const-string v5, "text"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_b
a=0;// 
a=0;//     .line 777
a=0;//     const-string v5, "text"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setText(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 779
a=0;//     :cond_b
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "pre"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_d
a=0;// 
a=0;//     .line 780
a=0;//     const-string v5, "pre"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 781
a=0;//     .local v3, "obj":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_d
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_d
a=0;// 
a=0;//     .line 782
a=0;//     const-string v5, "pre"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 783
a=0;//     .local v2, "j":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_c
a=0;// 
a=0;//     .line 784
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setPreId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 786
a=0;//     :cond_c
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "is_vip"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_d
a=0;// 
a=0;//     .line 787
a=0;//     const-string v5, "is_vip"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setPreVip(I)V
a=0;// 
a=0;//     .line 792
a=0;//     .end local v2    # "j":Lorg/json/JSONObject;
a=0;//     .end local v3    # "obj":Ljava/lang/Object;
a=0;//     :cond_d
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v5, "next"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 793
a=0;//     const-string v5, "next"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 794
a=0;//     .restart local v3    # "obj":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 795
a=0;//     const-string v5, "next"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 796
a=0;//     .restart local v2    # "j":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_e
a=0;// 
a=0;//     .line 797
a=0;//     const-string v5, "id"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setNextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 799
a=0;//     :cond_e
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "is_vip"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 800
a=0;//     const-string v5, "is_vip"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setNextVip(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 805
a=0;//     .end local v2    # "j":Lorg/json/JSONObject;
a=0;//     .end local v3    # "obj":Ljava/lang/Object;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 806
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 718
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :cond_f
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Boolean);v6=(Uninit);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/beans/OrderMsg;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/beans/OrderMsg;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/beans/OrderMsg;-><init>()V
a=0;// 
a=0;//     .line 719
a=0;//     .local v4, "order":Lcom/twocloo/com/cn/beans/OrderMsg;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/OrderMsg;);
a=0;//     const-string v5, "remain"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_10
a=0;// 
a=0;//     .line 720
a=0;//     const-string v5, "remain"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/beans/OrderMsg;->setRemain(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 722
a=0;//     :cond_10
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "cal_price"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_11
a=0;// 
a=0;//     .line 723
a=0;//     const-string v5, "cal_price"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/beans/OrderMsg;->setCalPrice(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 725
a=0;//     :cond_11
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "word_count"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_12
a=0;// 
a=0;//     .line 726
a=0;//     const-string v5, "word_count"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/beans/OrderMsg;->setWordCount(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 728
a=0;//     :cond_12
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "price"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_13
a=0;// 
a=0;//     .line 729
a=0;//     const-string v5, "price"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/beans/OrderMsg;->setPrice(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 731
a=0;//     :cond_13
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "vip_text_for_sub"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_14
a=0;// 
a=0;//     .line 732
a=0;//     const-string v5, "vip_text_for_sub"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/beans/OrderMsg;->setText(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 734
a=0;//     :cond_14
a=0;//     #v5=(Conflicted);
a=0;//     const-string v5, "time"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_15
a=0;// 
a=0;//     .line 735
a=0;//     const-string v5, "time"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v4, v5, v6}, Lcom/twocloo/com/cn/beans/OrderMsg;->setCurtime(J)V
a=0;// 
a=0;//     .line 737
a=0;//     :cond_15
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v5, "expireTime"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_16
a=0;// 
a=0;//     .line 738
a=0;//     const-string v5, "expireTime"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v4, v5, v6}, Lcom/twocloo/com/cn/beans/OrderMsg;->setOvertime(J)V
a=0;// 
a=0;//     .line 740
a=0;//     :cond_16
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v5, "discount"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_17
a=0;// 
a=0;//     .line 741
a=0;//     const-string v5, "discount"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Lcom/twocloo/com/cn/beans/OrderMsg;->setDiscount(I)V
a=0;// 
a=0;//     .line 742
a=0;//     const-string v5, "discount"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v0, v5}, Lcom/twocloo/com/cn/beans/RDBook;->setDiscount(I)V
a=0;// 
a=0;//     .line 744
a=0;//     :cond_17
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setOrderMsg(Lcom/twocloo/com/cn/beans/OrderMsg;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToRDBooks(Lorg/json/JSONObject;Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 5
a=0;//     .param p0, "jsonObject"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 673
a=0;//     .local p1, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 705
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 678
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const-string v0, "2"
a=0;// 
a=0;//     .line 679
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "info"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 680
a=0;//     .local v3, "jarray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v2, v4, :cond_0
a=0;// 
a=0;//     .line 681
a=0;//     invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Lorg/json/JSONObject;);
a=0;//     invoke-static {v4, p1}, Lcom/twocloo/com/cn/common/JsonToBean;->JsonToRDBookss(Lorg/json/JSONObject;Ljava/util/List;)Ljava/util/List;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 680
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 702
a=0;//     .end local v0    # "code":Ljava/lang/String;
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "jarray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 703
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToRDBookss(Lorg/json/JSONObject;Ljava/util/List;)Ljava/util/List;
a=0;//     .locals 6
a=0;//     .param p0, "jsonObject"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/RDBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     .local p1, "lists":Ljava/util/List;, "Ljava/util/List<Lcom/twocloo/com/cn/beans/RDBook;>;"
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 667
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 609
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/RDBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/RDBook;-><init>()V
a=0;// 
a=0;//     .line 610
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/RDBook;);
a=0;//     const-string v4, "2"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 611
a=0;//     const-string v4, "is_vip"
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 612
a=0;//     const-string v4, "is_vip"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setIsVip(I)V
a=0;// 
a=0;//     .line 614
a=0;//     :cond_1
a=0;//     const-string v4, "displayorder"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 615
a=0;//     const-string v4, "displayorder"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setOrder(I)V
a=0;// 
a=0;//     .line 617
a=0;//     :cond_2
a=0;//     const-string v4, "text_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 618
a=0;//     const-string v4, "text_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setTextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 620
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "text_title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     .line 621
a=0;//     const-string v4, "text_title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setTextTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 623
a=0;//     :cond_4
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "word_count"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 624
a=0;//     const-string v4, "word_count"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setWordCount(I)V
a=0;// 
a=0;//     .line 626
a=0;//     :cond_5
a=0;//     const-string v4, "article_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 627
a=0;//     const-string v4, "article_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setArticleId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 629
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "finishflag"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_7
a=0;// 
a=0;//     .line 630
a=0;//     const-string v4, "finishflag"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setFinishflag(I)V
a=0;// 
a=0;//     .line 632
a=0;//     :cond_7
a=0;//     const-string v4, "text"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_8
a=0;// 
a=0;//     .line 633
a=0;//     const-string v4, "text"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setText(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 635
a=0;//     :cond_8
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "pre"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_a
a=0;// 
a=0;//     .line 636
a=0;//     const-string v4, "pre"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 637
a=0;//     .local v3, "obj":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_a
a=0;// 
a=0;//     .line 638
a=0;//     const-string v4, "pre"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 639
a=0;//     .local v2, "j":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_9
a=0;// 
a=0;//     .line 640
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setPreId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 642
a=0;//     :cond_9
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "is_vip"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_a
a=0;// 
a=0;//     .line 643
a=0;//     const-string v4, "is_vip"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setPreVip(I)V
a=0;// 
a=0;//     .line 648
a=0;//     .end local v2    # "j":Lorg/json/JSONObject;
a=0;//     .end local v3    # "obj":Ljava/lang/Object;
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v4, "next"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_c
a=0;// 
a=0;//     .line 649
a=0;//     const-string v4, "next"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 650
a=0;//     .restart local v3    # "obj":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v3, :cond_c
a=0;// 
a=0;//     const-string v4, ""
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_c
a=0;// 
a=0;//     .line 651
a=0;//     const-string v4, "next"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 652
a=0;//     .restart local v2    # "j":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_b
a=0;// 
a=0;//     .line 653
a=0;//     const-string v4, "id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setNextId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 655
a=0;//     :cond_b
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "is_vip"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_c
a=0;// 
a=0;//     .line 656
a=0;//     const-string v4, "is_vip"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Lcom/twocloo/com/cn/beans/RDBook;->setNextVip(I)V
a=0;// 
a=0;//     .line 660
a=0;//     .end local v2    # "j":Lorg/json/JSONObject;
a=0;//     .end local v3    # "obj":Ljava/lang/Object;
a=0;//     :cond_c
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 661
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/RDBook;->getArticleId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/beans/RDBook;->getTextId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v0}, Lcom/twocloo/com/cn/common/Util;->write(Ljava/lang/String;Ljava/lang/String;Lcom/twocloo/com/cn/beans/RDBook;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 664
a=0;//     .end local v0    # "book":Lcom/twocloo/com/cn/beans/RDBook;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 665
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToSearch(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/SearchResult;
a=0;//     .locals 10
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1797
a=0;//     #v8=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 1891
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Lcom/twocloo/com/cn/beans/SearchResult;);v9=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 1800
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/beans/SearchResult;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/beans/SearchResult;);
a=0;//     invoke-direct {v7}, Lcom/twocloo/com/cn/beans/SearchResult;-><init>()V
a=0;// 
a=0;//     .line 1801
a=0;//     .local v7, "sr":Lcom/twocloo/com/cn/beans/SearchResult;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/SearchResult;);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1803
a=0;//     .local v6, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/NewBook;>;"
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v9, "list"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 1804
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1810
a=0;//     .local v5, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v5=(Null);
a=0;//     const-string v9, "list"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 1811
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1813
a=0;//     :cond_2
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/SearchResult;);
a=0;//     const-string v9, "list"
a=0;// 
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1814
a=0;//     #v5=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v4=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v5}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-lt v2, v9, :cond_6
a=0;// 
a=0;//     .line 1869
a=0;//     invoke-virtual {v7, v6}, Lcom/twocloo/com/cn/beans/SearchResult;->setBookList(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 1874
a=0;//     .end local v2    # "i":I
a=0;//     .end local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     const-string v9, "pages"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 1875
a=0;//     const-string v9, "pages"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1876
a=0;//     .local v3, "jo":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v9, "count"
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_4
a=0;// 
a=0;//     .line 1877
a=0;//     const-string v9, "count"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/SearchResult;->setBkcount(I)V
a=0;// 
a=0;//     .line 1879
a=0;//     :cond_4
a=0;//     const-string v9, "page"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_5
a=0;// 
a=0;//     .line 1880
a=0;//     const-string v9, "page"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/SearchResult;->setCurpage(I)V
a=0;// 
a=0;//     .line 1882
a=0;//     :cond_5
a=0;//     const-string v9, "page_count"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 1883
a=0;//     const-string v9, "page_count"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/SearchResult;->setPageCount(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1887
a=0;//     .end local v3    # "jo":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 1888
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 1891
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1815
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v5    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Integer);v3=(Uninit);v5=(Reference,Lorg/json/JSONArray;);v7=(Reference,Lcom/twocloo/com/cn/beans/SearchResult;);v9=(Integer);
a=0;//     invoke-virtual {v5, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1816
a=0;//     .local v4, "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/NewBook;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/NewBook;-><init>()V
a=0;// 
a=0;//     .line 1817
a=0;//     .local v0, "book":Lcom/twocloo/com/cn/beans/NewBook;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/NewBook;);
a=0;//     const-string v9, "totalviews"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_7
a=0;// 
a=0;//     .line 1818
a=0;//     const-string v9, "totalviews"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setTotalviews(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1820
a=0;//     :cond_7
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "articleid"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_8
a=0;// 
a=0;//     .line 1821
a=0;//     const-string v9, "articleid"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1823
a=0;//     :cond_8
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "title"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_9
a=0;// 
a=0;//     .line 1824
a=0;//     const-string v9, "title"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1826
a=0;//     :cond_9
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "author"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_a
a=0;// 
a=0;//     .line 1827
a=0;//     const-string v9, "author"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1829
a=0;//     :cond_a
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "finishflag"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_b
a=0;// 
a=0;//     .line 1830
a=0;//     const-string v9, "finishflag"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setFinishflag(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1832
a=0;//     :cond_b
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "sortname"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_c
a=0;// 
a=0;//     .line 1833
a=0;//     const-string v9, "sortname"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setSortname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1835
a=0;//     :cond_c
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "imagefname"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_d
a=0;// 
a=0;//     .line 1836
a=0;//     const-string v9, "imagefname"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setImgURL(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1838
a=0;//     :cond_d
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "source"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_e
a=0;// 
a=0;//     .line 1839
a=0;//     const-string v9, "source"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setSource(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1841
a=0;//     :cond_e
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "description"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_f
a=0;// 
a=0;//     .line 1842
a=0;//     const-string v9, "description"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setDescription(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1844
a=0;//     :cond_f
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "is_fence"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_10
a=0;// 
a=0;//     .line 1845
a=0;//     const-string v9, "is_fence"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setIs_fence(I)V
a=0;// 
a=0;//     .line 1847
a=0;//     :cond_10
a=0;//     const-string v9, "is_zongce"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_11
a=0;// 
a=0;//     .line 1848
a=0;//     const-string v9, "is_zongce"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/NewBook;->setIs_zongce(I)V
a=0;// 
a=0;//     .line 1850
a=0;//     :cond_11
a=0;//     invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 1814
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToShubenmulu(Lorg/json/JSONObject;I)Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     .locals 11
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .param p1, "page"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1054
a=0;//     #v8=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 1137
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 1057
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v7, Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     invoke-direct {v7}, Lcom/twocloo/com/cn/beans/Shubenmulu;-><init>()V
a=0;// 
a=0;//     .line 1058
a=0;//     .local v7, "sbml":Lcom/twocloo/com/cn/beans/Shubenmulu;
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1062
a=0;//     .local v5, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Chapterinfo;>;"
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v9, "article_info"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_5
a=0;// 
a=0;//     .line 1063
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     const-string v9, "article_info"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v3, v9}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1064
a=0;//     .local v3, "jobj":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v9, "title"
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_1
a=0;// 
a=0;//     .line 1065
a=0;//     const-string v9, "title"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1067
a=0;//     :cond_1
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "author"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     .line 1068
a=0;//     const-string v9, "author"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1070
a=0;//     :cond_2
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "finishflag"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 1071
a=0;//     const-string v9, "finishflag"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setFinishflag(I)V
a=0;// 
a=0;//     .line 1073
a=0;//     :cond_3
a=0;//     const-string v9, "last_text_time"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_4
a=0;// 
a=0;//     .line 1074
a=0;//     const-string v9, "last_text_time"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     invoke-virtual {v7, v9, v10}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setLastuptime(J)V
a=0;// 
a=0;//     .line 1076
a=0;//     :cond_4
a=0;//     #v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v9, "first_vip_chapter_displayorder"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_5
a=0;// 
a=0;//     .line 1077
a=0;//     const-string v9, "first_vip_chapter_displayorder"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setFcvip(I)V
a=0;// 
a=0;//     .line 1080
a=0;//     .end local v3    # "jobj":Lorg/json/JSONObject;
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     const-string v9, "current_page_number"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_6
a=0;// 
a=0;//     .line 1081
a=0;//     const-string v9, "current_page_number"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setCurrent_page_number(I)V
a=0;// 
a=0;//     .line 1084
a=0;//     :cond_6
a=0;//     const-string v9, "total_page_number"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_7
a=0;// 
a=0;//     .line 1085
a=0;//     const-string v9, "total_page_number"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v9}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setTotal_page_number(I)V
a=0;// 
a=0;//     .line 1087
a=0;//     :cond_7
a=0;//     const-string v9, "chapter_info"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_8
a=0;// 
a=0;//     .line 1088
a=0;//     const-string v9, ""
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "chapter_info"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v10}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_8
a=0;// 
a=0;//     .line 1089
a=0;//     const-string v9, "chapter_info"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1090
a=0;//     .local v4, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v4=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1091
a=0;//     .local v6, "p":I
a=0;//     #v6=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v6=(Integer);v9=(Conflicted);
a=0;//     invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-lt v2, v9, :cond_9
a=0;// 
a=0;//     .line 1131
a=0;//     .end local v2    # "i":I
a=0;//     .end local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     .end local v6    # "p":I
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v7, v5}, Lcom/twocloo/com/cn/beans/Shubenmulu;->setMulist(Ljava/util/ArrayList;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1133
a=0;//     :catch_0
a=0;//     #v9=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 1134
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v1}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v7, v8
a=0;// 
a=0;//     .line 1137
a=0;//     #v7=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1092
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     .restart local v6    # "p":I
a=0;//     :cond_9
a=0;//     :try_start_1
a=0;//     #v1=(Uninit);v2=(Integer);v4=(Reference,Lorg/json/JSONArray;);v6=(Integer);v7=(Reference,Lcom/twocloo/com/cn/beans/Shubenmulu;);v9=(Integer);v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1093
a=0;//     .restart local v3    # "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v0, Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     invoke-direct {v0}, Lcom/twocloo/com/cn/beans/Chapterinfo;-><init>()V
a=0;// 
a=0;//     .line 1094
a=0;//     .local v0, "cti":Lcom/twocloo/com/cn/beans/Chapterinfo;
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/beans/Chapterinfo;);
a=0;//     const-string v9, "id"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_a
a=0;// 
a=0;//     .line 1095
a=0;//     const-string v9, "id"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setId(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1097
a=0;//     :cond_a
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "subhead"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_b
a=0;// 
a=0;//     .line 1098
a=0;//     const-string v9, "subhead"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setSubhead(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1100
a=0;//     :cond_b
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "is_vip"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_c
a=0;// 
a=0;//     .line 1101
a=0;//     const-string v9, "is_vip"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setIs_vip(I)V
a=0;// 
a=0;//     .line 1103
a=0;//     :cond_c
a=0;//     const-string v9, "word_count"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_d
a=0;// 
a=0;//     .line 1104
a=0;//     const-string v9, "word_count"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setWord_count(I)V
a=0;// 
a=0;//     .line 1105
a=0;//     invoke-virtual {v0, v6}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setPosi(I)V
a=0;// 
a=0;//     .line 1106
a=0;//     const-string v9, "word_count"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     add-int/2addr v6, v9
a=0;// 
a=0;//     .line 1108
a=0;//     :cond_d
a=0;//     const-string v9, "create_time"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_e
a=0;// 
a=0;//     .line 1109
a=0;//     const-string v9, "create_time"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setCreate_time(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1111
a=0;//     :cond_e
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "update_time"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_f
a=0;// 
a=0;//     .line 1112
a=0;//     const-string v9, "update_time"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setUpdate_time(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1114
a=0;//     :cond_f
a=0;//     #v9=(Conflicted);
a=0;//     const-string v9, "status"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_10
a=0;// 
a=0;//     .line 1115
a=0;//     const-string v9, "status"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setStatus(I)V
a=0;// 
a=0;//     .line 1117
a=0;//     :cond_10
a=0;//     const-string v9, "displayorder"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_11
a=0;// 
a=0;//     .line 1118
a=0;//     const-string v9, "displayorder"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v9}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v0, v9}, Lcom/twocloo/com/cn/beans/Chapterinfo;->setDisplayorder(I)V
a=0;// 
a=0;//     .line 1121
a=0;//     :cond_11
a=0;//     invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 1091
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToShubenxinxiye(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     .locals 12
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 889
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 1043
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 892
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     invoke-direct {v6}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;-><init>()V
a=0;// 
a=0;//     .line 893
a=0;//     .local v6, "sbxxy":Lcom/twocloo/com/cn/beans/Shubenxinxiye;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shubenxinxiye;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 895
a=0;//     .local v5, "ofi":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/OtherFenceInfo;>;"
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v7, "source"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 896
a=0;//     const-string v7, "source"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setLaiyuan(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 898
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "is_zongce"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 899
a=0;//     const-string v7, "is_zongce"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setIs_zongce(I)V
a=0;// 
a=0;//     .line 901
a=0;//     :cond_3
a=0;//     const-string v7, "is_fence"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 902
a=0;//     const-string v7, "is_fence"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setIs_fence(I)V
a=0;// 
a=0;//     .line 905
a=0;//     :cond_4
a=0;//     const-string v7, "is_ykj"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 906
a=0;//     const-string v7, "is_ykj"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setIs_ykj(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 909
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "discount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_24
a=0;// 
a=0;//     .line 910
a=0;//     const-string v7, "discount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setZhekou(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 917
a=0;//     :goto_1
a=0;//     const-string v7, "month_status"
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 918
a=0;//     const-string v7, "month_status"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setBaoyueStatue(I)V
a=0;// 
a=0;//     .line 920
a=0;//     :cond_6
a=0;//     const-string v7, "authorid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 921
a=0;//     const-string v7, "authorid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setAuthorid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 923
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 924
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 926
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "sortname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 927
a=0;//     const-string v7, "sortname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setSortname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 929
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "wordtotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     .line 930
a=0;//     const-string v7, "wordtotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setWordtotal(I)V
a=0;// 
a=0;//     .line 932
a=0;//     :cond_a
a=0;//     const-string v7, "receiveTotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_b
a=0;// 
a=0;//     .line 933
a=0;//     const-string v7, "receiveTotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setDashang(I)V
a=0;// 
a=0;//     .line 935
a=0;//     :cond_b
a=0;//     const-string v7, "totalfavor"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_c
a=0;// 
a=0;//     .line 936
a=0;//     const-string v7, "totalfavor"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setTotalfavor(I)V
a=0;// 
a=0;//     .line 938
a=0;//     :cond_c
a=0;//     const-string v7, "totalviews"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_d
a=0;// 
a=0;//     .line 939
a=0;//     const-string v7, "totalviews"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setTotalviews(I)V
a=0;// 
a=0;//     .line 941
a=0;//     :cond_d
a=0;//     const-string v7, "hasfavor"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_e
a=0;// 
a=0;//     .line 942
a=0;//     const-string v7, "hasfavor"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setHasfavor(I)V
a=0;// 
a=0;//     .line 944
a=0;//     :cond_e
a=0;//     const-string v7, "hasrecommend"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_f
a=0;// 
a=0;//     .line 945
a=0;//     const-string v7, "hasrecommend"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setHasrecommend(I)V
a=0;// 
a=0;//     .line 948
a=0;//     :cond_f
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_10
a=0;// 
a=0;//     .line 949
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setFinishflag(I)V
a=0;// 
a=0;//     .line 951
a=0;//     :cond_10
a=0;//     const-string v7, "book_logo"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_11
a=0;// 
a=0;//     .line 952
a=0;//     const-string v7, "book_logo"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setBook_logo(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 955
a=0;//     :cond_11
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_12
a=0;// 
a=0;//     .line 956
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 958
a=0;//     :cond_12
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "voters"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_13
a=0;// 
a=0;//     .line 959
a=0;//     const-string v7, "voters"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setVoters(I)V
a=0;// 
a=0;//     .line 961
a=0;//     :cond_13
a=0;//     const-string v7, "description"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_14
a=0;// 
a=0;//     .line 962
a=0;//     const-string v7, "description"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setDescription(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 964
a=0;//     :cond_14
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "textcount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_15
a=0;// 
a=0;//     .line 965
a=0;//     const-string v7, "textcount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setTextcount(I)V
a=0;// 
a=0;//     .line 967
a=0;//     :cond_15
a=0;//     const-string v7, "free_textcount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_16
a=0;// 
a=0;//     .line 968
a=0;//     const-string v7, "free_textcount"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setFree_textcount(I)V
a=0;// 
a=0;//     .line 970
a=0;//     :cond_16
a=0;//     const-string v7, "first_vip_chapter_displayorder"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_17
a=0;// 
a=0;//     .line 971
a=0;//     const-string v7, "first_vip_chapter_displayorder"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setFirst_vip_chapter_displayorder(I)V
a=0;// 
a=0;//     .line 973
a=0;//     :cond_17
a=0;//     const-string v7, "first_chapter_is_vip"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_18
a=0;// 
a=0;//     .line 975
a=0;//     const-string v7, "first_chapter_is_vip"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setFirst_chapter_is_vip(I)V
a=0;// 
a=0;//     .line 977
a=0;//     :cond_18
a=0;//     const-string v7, "first_chapter_id"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_19
a=0;// 
a=0;//     .line 978
a=0;//     const-string v7, "first_chapter_id"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setFirst_chapter_id(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 980
a=0;//     :cond_19
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1a
a=0;// 
a=0;//     .line 981
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 983
a=0;//     :cond_1a
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "fence_price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1b
a=0;// 
a=0;//     .line 984
a=0;//     const-string v7, "fence_price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setFence_price(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 986
a=0;//     :cond_1b
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "zongce_articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1c
a=0;// 
a=0;//     .line 987
a=0;//     const-string v7, "zongce_articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setZongce_articleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 989
a=0;//     :cond_1c
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "is_buy"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1d
a=0;// 
a=0;//     .line 990
a=0;//     const-string v7, "is_buy"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setIs_buy(I)V
a=0;// 
a=0;//     .line 992
a=0;//     :cond_1d
a=0;//     const-string v7, "other_fence_info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1e
a=0;// 
a=0;//     .line 993
a=0;//     const-string v7, "other_fence_info"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 994
a=0;//     .local v4, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v4=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-lt v1, v7, :cond_25
a=0;// 
a=0;//     .line 1015
a=0;//     .end local v1    # "i":I
a=0;//     .end local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_1e
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v6, v5}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setOther_fence_info(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 1017
a=0;//     const-string v7, "lastUpdateInfo"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 1018
a=0;//     new-instance v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/json/JSONObject;);
a=0;//     const-string v7, "lastUpdateInfo"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v3, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1019
a=0;//     .local v3, "jobj":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "textid"
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1f
a=0;// 
a=0;//     .line 1020
a=0;//     const-string v7, "textid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setTextid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1022
a=0;//     :cond_1f
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "is_vip"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_20
a=0;// 
a=0;//     .line 1023
a=0;//     const-string v7, "is_vip"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setIs_vip(I)V
a=0;// 
a=0;//     .line 1025
a=0;//     :cond_20
a=0;//     const-string v7, "order"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_21
a=0;// 
a=0;//     .line 1026
a=0;//     const-string v7, "order"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setOrder(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1028
a=0;//     :cond_21
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "chapter_title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_22
a=0;// 
a=0;//     .line 1029
a=0;//     const-string v7, "chapter_title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setChapter_title(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1031
a=0;//     :cond_22
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "update_time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_23
a=0;// 
a=0;//     .line 1032
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "update_time"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v8}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v8
a=0;// 
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     const-wide/16 v10, 0x3e8
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     mul-long/2addr v8, v10
a=0;// 
a=0;//     invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setUpdate_time(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_23
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     const-string v7, "datestr"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 1035
a=0;//     const-string v7, "datestr"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setUpdate_str(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1039
a=0;//     .end local v3    # "jobj":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1040
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 912
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_24
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Boolean);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Lcom/twocloo/com/cn/beans/Shubenxinxiye;->setZhekou(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 995
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v4    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_25
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Lorg/json/JSONArray;);v7=(Integer);
a=0;//     invoke-virtual {v4, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 996
a=0;//     .restart local v3    # "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v2, Lcom/twocloo/com/cn/beans/OtherFenceInfo;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/beans/OtherFenceInfo;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/beans/OtherFenceInfo;-><init>()V
a=0;// 
a=0;//     .line 997
a=0;//     .local v2, "info":Lcom/twocloo/com/cn/beans/OtherFenceInfo;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/OtherFenceInfo;);
a=0;//     const-string v7, "fence_articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_26
a=0;// 
a=0;//     .line 998
a=0;//     const-string v7, "fence_articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/OtherFenceInfo;->setFence_articleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1000
a=0;//     :cond_26
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "fence_title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_27
a=0;// 
a=0;//     .line 1001
a=0;//     const-string v7, "fence_title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/OtherFenceInfo;->setFence_title(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1003
a=0;//     :cond_27
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "fence_num"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_28
a=0;// 
a=0;//     .line 1004
a=0;//     const-string v7, "fence_num"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/OtherFenceInfo;->setFence_num(I)V
a=0;// 
a=0;//     .line 1006
a=0;//     :cond_28
a=0;//     const-string v7, "price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_29
a=0;// 
a=0;//     .line 1007
a=0;//     const-string v7, "price"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/OtherFenceInfo;->setPrice(I)V
a=0;// 
a=0;//     .line 1009
a=0;//     :cond_29
a=0;//     const-string v7, "is_buy"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2a
a=0;// 
a=0;//     .line 1010
a=0;//     const-string v7, "is_buy"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/OtherFenceInfo;->setIs_buy(I)V
a=0;// 
a=0;//     .line 1012
a=0;//     :cond_2a
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 994
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToShupinginfo(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;//     .locals 13
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v11, 0x3e8
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1147
a=0;//     #v7=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1279
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lcom/twocloo/com/cn/beans/Shupinginfo;);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1150
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/beans/Shupinginfo;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/com/cn/beans/Shupinginfo;-><init>()V
a=0;// 
a=0;//     .line 1151
a=0;//     .local v5, "spif":Lcom/twocloo/com/cn/beans/Shupinginfo;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/Shupinginfo;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1153
a=0;//     .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/Shuping_maininfo;>;"
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v8, "meta_info"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 1154
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     const-string v8, "meta_info"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v2, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1155
a=0;//     .local v2, "jobj":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v8, "total_number"
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 1156
a=0;//     const-string v8, "total_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/com/cn/beans/Shupinginfo;->setTotal_number(I)V
a=0;// 
a=0;//     .line 1158
a=0;//     :cond_1
a=0;//     const-string v8, "total_page_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 1159
a=0;//     const-string v8, "total_page_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/com/cn/beans/Shupinginfo;->setTotal_page_number(I)V
a=0;// 
a=0;//     .line 1161
a=0;//     :cond_2
a=0;//     const-string v8, "cur_page_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 1162
a=0;//     const-string v8, "cur_page_number"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/com/cn/beans/Shupinginfo;->setCur_page_number(I)V
a=0;// 
a=0;//     .line 1165
a=0;//     .end local v2    # "jobj":Lorg/json/JSONObject;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v8, "main_info"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     .line 1166
a=0;//     const-string v8, "main_info"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1167
a=0;//     .local v3, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v1, v8, :cond_5
a=0;// 
a=0;//     .line 1274
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v5, v4}, Lcom/twocloo/com/cn/beans/Shupinginfo;->setSPlist(Ljava/util/ArrayList;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1276
a=0;//     :catch_0
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1277
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 1279
a=0;//     #v5=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1168
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_5
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Integer);v3=(Reference,Lorg/json/JSONArray;);v5=(Reference,Lcom/twocloo/com/cn/beans/Shupinginfo;);v8=(Integer);
a=0;//     invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1169
a=0;//     .restart local v2    # "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v6, Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     invoke-direct {v6}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;-><init>()V
a=0;// 
a=0;//     .line 1170
a=0;//     .local v6, "spmif":Lcom/twocloo/com/cn/beans/Shuping_maininfo;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/Shuping_maininfo;);
a=0;//     const-string v8, "tid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_6
a=0;// 
a=0;//     .line 1171
a=0;//     const-string v8, "tid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setTid(I)V
a=0;// 
a=0;//     .line 1173
a=0;//     :cond_6
a=0;//     const-string v8, "fid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 1174
a=0;//     const-string v8, "fid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setFid(I)V
a=0;// 
a=0;//     .line 1176
a=0;//     :cond_7
a=0;//     const-string v8, "iconid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     .line 1177
a=0;//     const-string v8, "iconid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setIconid(I)V
a=0;// 
a=0;//     .line 1179
a=0;//     :cond_8
a=0;//     const-string v8, "typeid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_9
a=0;// 
a=0;//     .line 1180
a=0;//     const-string v8, "typeid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setTypeid(I)V
a=0;// 
a=0;//     .line 1182
a=0;//     :cond_9
a=0;//     const-string v8, "readperm"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_a
a=0;// 
a=0;//     .line 1183
a=0;//     const-string v8, "readperm"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setReadperm(I)V
a=0;// 
a=0;//     .line 1185
a=0;//     :cond_a
a=0;//     const-string v8, "price"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_b
a=0;// 
a=0;//     .line 1186
a=0;//     const-string v8, "price"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setPrice(I)V
a=0;// 
a=0;//     .line 1188
a=0;//     :cond_b
a=0;//     const-string v8, "author"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_26
a=0;// 
a=0;//     .line 1189
a=0;//     const-string v8, "author"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1193
a=0;//     :goto_2
a=0;//     const-string v8, "authorid"
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_c
a=0;// 
a=0;//     .line 1194
a=0;//     const-string v8, "authorid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setAuthorid(I)V
a=0;// 
a=0;//     .line 1196
a=0;//     :cond_c
a=0;//     const-string v8, "subject"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_d
a=0;// 
a=0;//     .line 1197
a=0;//     const-string v8, "subject"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setSubject(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1199
a=0;//     :cond_d
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "dateline"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_e
a=0;// 
a=0;//     .line 1200
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "dateline"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     mul-long/2addr v9, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setDateline(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1202
a=0;//     :cond_e
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v8, "lastpost"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_f
a=0;// 
a=0;//     .line 1203
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "lastpost"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
a=0;// 
a=0;//     move-result-wide v9
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     mul-long/2addr v9, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setLastpost(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1205
a=0;//     :cond_f
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const-string v8, "lastposter"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_10
a=0;// 
a=0;//     .line 1206
a=0;//     const-string v8, "lastposter"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setLastposter(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1208
a=0;//     :cond_10
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "views"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_11
a=0;// 
a=0;//     .line 1209
a=0;//     const-string v8, "views"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setViews(I)V
a=0;// 
a=0;//     .line 1211
a=0;//     :cond_11
a=0;//     const-string v8, "replies"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_12
a=0;// 
a=0;//     .line 1212
a=0;//     const-string v8, "replies"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setReplies(I)V
a=0;// 
a=0;//     .line 1214
a=0;//     :cond_12
a=0;//     const-string v8, "displayorder"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_13
a=0;// 
a=0;//     .line 1215
a=0;//     const-string v8, "displayorder"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setDisplayorder(I)V
a=0;// 
a=0;//     .line 1217
a=0;//     :cond_13
a=0;//     const-string v8, "highlight"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_14
a=0;// 
a=0;//     .line 1218
a=0;//     const-string v8, "highlight"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setHighlight(I)V
a=0;// 
a=0;//     .line 1220
a=0;//     :cond_14
a=0;//     const-string v8, "digest"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_15
a=0;// 
a=0;//     .line 1221
a=0;//     const-string v8, "digest"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setDigest(I)V
a=0;// 
a=0;//     .line 1223
a=0;//     :cond_15
a=0;//     const-string v8, "rate"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_16
a=0;// 
a=0;//     .line 1224
a=0;//     const-string v8, "rate"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setRate(I)V
a=0;// 
a=0;//     .line 1226
a=0;//     :cond_16
a=0;//     const-string v8, "blog"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_17
a=0;// 
a=0;//     .line 1227
a=0;//     const-string v8, "blog"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setBlog(I)V
a=0;// 
a=0;//     .line 1229
a=0;//     :cond_17
a=0;//     const-string v8, "special"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_18
a=0;// 
a=0;//     .line 1230
a=0;//     const-string v8, "special"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setSpecial(I)V
a=0;// 
a=0;//     .line 1232
a=0;//     :cond_18
a=0;//     const-string v8, "attachment"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_19
a=0;// 
a=0;//     .line 1233
a=0;//     const-string v8, "attachment"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setAttachment(I)V
a=0;// 
a=0;//     .line 1235
a=0;//     :cond_19
a=0;//     const-string v8, "subscribed"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1a
a=0;// 
a=0;//     .line 1236
a=0;//     const-string v8, "subscribed"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setSubscribed(I)V
a=0;// 
a=0;//     .line 1238
a=0;//     :cond_1a
a=0;//     const-string v8, "moderated"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1b
a=0;// 
a=0;//     .line 1239
a=0;//     const-string v8, "moderated"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setModerated(I)V
a=0;// 
a=0;//     .line 1241
a=0;//     :cond_1b
a=0;//     const-string v8, "closed"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1c
a=0;// 
a=0;//     .line 1242
a=0;//     const-string v8, "closed"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setClosed(I)V
a=0;// 
a=0;//     .line 1244
a=0;//     :cond_1c
a=0;//     const-string v8, "itemid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1d
a=0;// 
a=0;//     .line 1245
a=0;//     const-string v8, "itemid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setItemid(I)V
a=0;// 
a=0;//     .line 1247
a=0;//     :cond_1d
a=0;//     const-string v8, "supe_pushstatus"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1e
a=0;// 
a=0;//     .line 1248
a=0;//     const-string v8, "supe_pushstatus"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setSupe_pushstatus(I)V
a=0;// 
a=0;//     .line 1250
a=0;//     :cond_1e
a=0;//     const-string v8, "author_replied"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1f
a=0;// 
a=0;//     .line 1251
a=0;//     const-string v8, "author_replied"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setAuthor_replied(I)V
a=0;// 
a=0;//     .line 1253
a=0;//     :cond_1f
a=0;//     const-string v8, "pid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_20
a=0;// 
a=0;//     .line 1254
a=0;//     const-string v8, "pid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setPid(I)V
a=0;// 
a=0;//     .line 1256
a=0;//     :cond_20
a=0;//     const-string v8, "message"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_21
a=0;// 
a=0;//     .line 1257
a=0;//     const-string v8, "message"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setMessage(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1259
a=0;//     :cond_21
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "vip_level"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_22
a=0;// 
a=0;//     .line 1260
a=0;//     const-string v8, "vip_level"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setVip_level(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1262
a=0;//     :cond_22
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "lastposterid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_23
a=0;// 
a=0;//     .line 1263
a=0;//     const-string v8, "lastposterid"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setLastposterid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1265
a=0;//     :cond_23
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "logo"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_24
a=0;// 
a=0;//     .line 1266
a=0;//     const-string v8, "logo"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setLogo(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1268
a=0;//     :cond_24
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "up"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_25
a=0;// 
a=0;//     .line 1269
a=0;//     const-string v8, "up"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setUpcount(I)V
a=0;// 
a=0;//     .line 1271
a=0;//     :cond_25
a=0;//     invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1167
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1191
a=0;//     :cond_26
a=0;//     #v8=(Boolean);
a=0;//     const-string v8, "\u4e8c\u5c42\u697c\u4e66\u9662\u4e66\u53cb"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/Shuping_maininfo;->setAuthor(Ljava/lang/String;)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToSubedchaptersinfo(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;//     .locals 7
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1336
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 1337
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1378
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);v6=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1339
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;-><init>()V
a=0;// 
a=0;//     .line 1342
a=0;//     .local v5, "subed_chapters_info":Lcom/twocloo/com/cn/beans/Subed_chapters_info;
a=0;//     :try_start_0
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/Subed_chapters_info;);
a=0;//     const-string v6, "info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 1343
a=0;//     const-string v6, "info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->setInfo(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1345
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "subed_textid_list"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 1346
a=0;//     const-string v6, "subed_textid_list"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1347
a=0;//     .local v3, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/common/JsonToBean$1;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/common/JsonToBean$1;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/common/JsonToBean$1;-><init>()V
a=0;// 
a=0;//     .line 1362
a=0;//     .local v1, "hashSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/common/JsonToBean$1;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v2, v6, :cond_4
a=0;// 
a=0;//     .line 1366
a=0;//     invoke-virtual {v5, v1}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->setSubed_textid_list(Ljava/util/HashSet;)V
a=0;// 
a=0;//     .line 1370
a=0;//     .end local v1    # "hashSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v6, "subed_last_textid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 1371
a=0;//     const-string v6, "subed_last_textid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/Subed_chapters_info;->setSubed_last_textid(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1375
a=0;//     :catch_0
a=0;//     #v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1376
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1363
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     .restart local v1    # "hashSet":Ljava/util/HashSet;, "Ljava/util/HashSet<Ljava/lang/String;>;"
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Reference,Lcom/twocloo/com/cn/common/JsonToBean$1;);v2=(Integer);v3=(Reference,Lorg/json/JSONArray;);v6=(Integer);
a=0;//     invoke-virtual {v3, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1364
a=0;//     .local v4, "str":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 1362
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToTagList(Lorg/json/JSONObject;)Ljava/util/ArrayList;
a=0;//     .locals 7
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 439
a=0;//     #v5=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 456
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/ArrayList;);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 442
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 444
a=0;//     .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/String;>;"
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v6, "root"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 445
a=0;//     const-string v6, "root"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 446
a=0;//     .local v3, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v1, v6, :cond_0
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 448
a=0;//     .local v2, "jobj":Ljava/lang/Object;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 446
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 452
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "jobj":Ljava/lang/Object;
a=0;//     .end local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 453
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 456
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToUser(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/User;
a=0;//     .locals 5
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 52
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/twocloo/com/cn/beans/User;);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 54
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/beans/User;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/beans/User;-><init>()V
a=0;// 
a=0;//     .line 57
a=0;//     .local v2, "user":Lcom/twocloo/com/cn/beans/User;
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/User;);
a=0;//     const-string v3, "code"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     const-string v3, "code"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 60
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "uid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 61
a=0;//     const-string v3, "uid"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setUid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 63
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "username"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 64
a=0;//     const-string v3, "username"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setUsername(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 66
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "nickname"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     .line 67
a=0;//     const-string v3, "nickname"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setNickname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "email"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 70
a=0;//     const-string v3, "email"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setEmail(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 72
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "logo"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     .line 73
a=0;//     const-string v3, "logo"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setLogo(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "remain"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_8
a=0;// 
a=0;//     .line 76
a=0;//     const-string v3, "remain"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setRemain(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "tel"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_9
a=0;// 
a=0;//     .line 79
a=0;//     const-string v3, "tel"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setTel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 81
a=0;//     :cond_9
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "vip_level"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_a
a=0;// 
a=0;//     .line 82
a=0;//     const-string v3, "vip_level"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setVipLevel(I)V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_a
a=0;//     const-string v3, "is_baoyue"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_b
a=0;// 
a=0;//     .line 85
a=0;//     const-string v3, "0"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "is_baoyue"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_e
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 86
a=0;//     .local v1, "isBaoYue":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, v1}, Lcom/twocloo/com/cn/beans/User;->setBaoYue(Z)V
a=0;// 
a=0;//     .line 88
a=0;//     .end local v1    # "isBaoYue":Z
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     const-string v3, "token"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_c
a=0;// 
a=0;//     .line 89
a=0;//     const-string v3, "token"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setToken(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 92
a=0;//     :cond_c
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "mobile"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_d
a=0;// 
a=0;//     .line 93
a=0;//     const-string v3, "mobile"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setBtel(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_d
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "password"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     const-string v3, "password"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/User;->setPassword(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 99
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 85
a=0;//     .end local v0    # "e":Lorg/json/JSONException;
a=0;//     :cond_e
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToUserCenterNewBean(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;//     .locals 3
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 217
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/UserCenterNewbean;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 144
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/UserCenterNewbean;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;-><init>()V
a=0;// 
a=0;//     .line 147
a=0;//     .local v1, "userinfo":Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/UserCenterNewbean;);
a=0;//     const-string v2, "code"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 148
a=0;//     const-string v2, "code"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 150
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "yuedubi_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 151
a=0;//     const-string v2, "yuedubi_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setYuedubi_count(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 153
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "shuquan_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 154
a=0;//     const-string v2, "shuquan_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setShuquan_count(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 162
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "show_assignment"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     .line 163
a=0;//     const-string v2, "show_assignment"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setShow_assignment(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 165
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "yuepiao_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 166
a=0;//     const-string v2, "yuepiao_count"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setYuepiao_count(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 168
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "tuijianpiao"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_7
a=0;// 
a=0;//     .line 169
a=0;//     const-string v2, "tuijianpiao"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setTuijianpiao_count(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_7
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "mobile"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_8
a=0;// 
a=0;//     .line 172
a=0;//     const-string v2, "mobile"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setMobile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 174
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "logo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_9
a=0;// 
a=0;//     .line 175
a=0;//     const-string v2, "logo"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setLogoUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 177
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "is_offers_show"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     .line 178
a=0;//     const-string v2, "is_offers_show"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setShow_offers(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 180
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "sex"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     .line 181
a=0;//     const-string v2, "sex"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setGender(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 183
a=0;//     :cond_b
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "nickname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_c
a=0;// 
a=0;//     .line 184
a=0;//     const-string v2, "nickname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setNickname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 186
a=0;//     :cond_c
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "username"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     .line 187
a=0;//     const-string v2, "username"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setUsername(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 189
a=0;//     :cond_d
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "mark"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_e
a=0;// 
a=0;//     .line 190
a=0;//     const-string v2, "mark"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setMark(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 192
a=0;//     :cond_e
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "sign"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_f
a=0;// 
a=0;//     .line 193
a=0;//     const-string v2, "sign"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setSign(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 195
a=0;//     :cond_f
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "email"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_10
a=0;// 
a=0;//     .line 196
a=0;//     const-string v2, "email"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setEmail(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 198
a=0;//     :cond_10
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "star"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_11
a=0;// 
a=0;//     .line 199
a=0;//     const-string v2, "star"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setStar(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 201
a=0;//     :cond_11
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "age"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_12
a=0;// 
a=0;//     .line 202
a=0;//     const-string v2, "age"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setAge(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 204
a=0;//     :cond_12
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "birth_year"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_13
a=0;// 
a=0;//     .line 205
a=0;//     const-string v2, "birth_year"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setBirth_year(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 207
a=0;//     :cond_13
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "birth_month"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_14
a=0;// 
a=0;//     .line 208
a=0;//     const-string v2, "birth_month"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setBirth_month(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 210
a=0;//     :cond_14
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "birth_day"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     const-string v2, "birth_day"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->setBirth_day(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 215
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToUserCoinDetail(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/UserCoinDetailbean;
a=0;//     .locals 9
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v7=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 260
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Reference,Lcom/twocloo/com/cn/beans/UserCoinDetailbean;);v8=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/beans/UserCoinDetailbean;);
a=0;//     invoke-direct {v6}, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;-><init>()V
a=0;// 
a=0;//     .line 225
a=0;//     .local v6, "uc":Lcom/twocloo/com/cn/beans/UserCoinDetailbean;
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/beans/UserCoinDetailbean;);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 227
a=0;//     .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/RecordContent;>;"
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v8, "code"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 228
a=0;//     const-string v8, "code"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 230
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "yuedubi_count"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 231
a=0;//     const-string v8, "yuedubi_count"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;->setYuedubi_count(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 233
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "zengbi_count"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_3
a=0;// 
a=0;//     .line 234
a=0;//     const-string v8, "zengbi_count"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;->setZengbi_count(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 236
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "youxiaoqi"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     .line 237
a=0;//     const-string v8, "youxiaoqi"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;->setYouxiaoqi(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 239
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "record"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 240
a=0;//     const-string v8, "record"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 241
a=0;//     .local v3, "jsonArray":Lorg/json/JSONArray;
a=0;//     #v3=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v5=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v3}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-lt v1, v8, :cond_6
a=0;// 
a=0;//     .line 254
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {v6, v4}, Lcom/twocloo/com/cn/beans/UserCoinDetailbean;->setRc(Ljava/util/ArrayList;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 256
a=0;//     :catch_0
a=0;//     #v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 257
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     move-object v6, v7
a=0;// 
a=0;//     .line 260
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 242
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v3    # "jsonArray":Lorg/json/JSONArray;
a=0;//     :cond_6
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Integer);v3=(Reference,Lorg/json/JSONArray;);v6=(Reference,Lcom/twocloo/com/cn/beans/UserCoinDetailbean;);v8=(Integer);
a=0;//     invoke-virtual {v3, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 243
a=0;//     .local v2, "jobj":Lorg/json/JSONObject;
a=0;//     new-instance v5, Lcom/twocloo/com/cn/beans/RecordContent;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/beans/RecordContent;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/com/cn/beans/RecordContent;-><init>()V
a=0;// 
a=0;//     .line 244
a=0;//     .local v5, "rc":Lcom/twocloo/com/cn/beans/RecordContent;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/RecordContent;);
a=0;//     const-string v8, "record_content"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 245
a=0;//     const-string v8, "record_content"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/com/cn/beans/RecordContent;->setRecord_content(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 247
a=0;//     :cond_7
a=0;//     #v8=(Conflicted);
a=0;//     const-string v8, "time"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     .line 248
a=0;//     const-string v8, "time"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v5, v8}, Lcom/twocloo/com/cn/beans/RecordContent;->setTime(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 251
a=0;//     :cond_8
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 241
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static JsonToVersion(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/Version;
a=0;//     .locals 3
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 265
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 285
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Lcom/twocloo/com/cn/beans/Version;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 267
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/Version;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/Version;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/Version;-><init>()V
a=0;// 
a=0;//     .line 269
a=0;//     .local v1, "v":Lcom/twocloo/com/cn/beans/Version;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/Version;);
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 270
a=0;//     const-string v2, "version"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/Version;->setVersionCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 272
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "subver"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 273
a=0;//     const-string v2, "subver"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/Version;->setSubver(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 275
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "appname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 276
a=0;//     const-string v2, "appname"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/Version;->setAppname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 278
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     const-string v2, "appurl"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 279
a=0;//     const-string v2, "appurl"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/beans/Version;->setAppurl(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 282
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 283
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v0}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static jsonToBFBook(Lorg/json/JSONObject;)Ljava/util/Vector;
a=0;//     .locals 8
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1382
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v4, v6
a=0;// 
a=0;//     .line 1428
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/Vector;);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 1385
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     new-instance v4, Ljava/util/Vector;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v4}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     .line 1388
a=0;//     .local v4, "list":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/util/Vector;);
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     .line 1390
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1392
a=0;//     .local v0, "array":Lorg/json/JSONArray;
a=0;//     #v0=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Integer);v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v3, v7, :cond_0
a=0;// 
a=0;//     .line 1394
a=0;//     invoke-virtual {v0, v3}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1395
a=0;//     .local v5, "obj":Lorg/json/JSONObject;
a=0;//     new-instance v1, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v1}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 1397
a=0;//     .local v1, "bfbook":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 1398
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1400
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "wordtotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 1401
a=0;//     const-string v7, "wordtotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setWordtotal(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1403
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 1404
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1406
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 1407
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 1409
a=0;//     :cond_5
a=0;//     const-string v7, "imagefname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 1410
a=0;//     const-string v7, "imagefname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setImagefname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1412
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 1413
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1415
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "source"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 1416
a=0;//     const-string v7, "source"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setSource(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1418
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "is_fence"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 1419
a=0;//     const-string v7, "is_fence"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v1, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setIs_fence(I)V
a=0;// 
a=0;//     .line 1421
a=0;//     :cond_9
a=0;//     invoke-virtual {v4, v1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1392
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1425
a=0;//     .end local v0    # "array":Lorg/json/JSONArray;
a=0;//     .end local v1    # "bfbook":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "obj":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 1426
a=0;//     .local v2, "e":Ljava/lang/Exception;
a=0;//     #v2=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v2}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v2    # "e":Ljava/lang/Exception;
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);v7=(Conflicted);
a=0;//     move-object v4, v6
a=0;// 
a=0;//     .line 1428
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static jsonToLikemoreBook(Lorg/json/JSONObject;)Ljava/util/ArrayList;
a=0;//     .locals 7
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/LikeMoreBookBean;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1579
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 1580
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 1620
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/ArrayList;);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 1582
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1584
a=0;//     .local v4, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/LikeMoreBookBean;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const-string v6, "code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 1585
a=0;//     const-string v6, "code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1586
a=0;//     .local v0, "code":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "1"
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1587
a=0;//     const-string v6, "info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 1588
a=0;//     const-string v6, "info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1589
a=0;//     .local v2, "ja":Lorg/json/JSONArray;
a=0;//     #v2=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1590
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v1, v6, :cond_0
a=0;// 
a=0;//     .line 1591
a=0;//     new-instance v5, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/beans/LikeMoreBookBean;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;-><init>()V
a=0;// 
a=0;//     .line 1592
a=0;//     .local v5, "lmb":Lcom/twocloo/com/cn/beans/LikeMoreBookBean;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/LikeMoreBookBean;);
a=0;//     invoke-virtual {v2, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1593
a=0;//     .local v3, "jo":Lorg/json/JSONObject;
a=0;//     #v3=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 1594
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setAid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1596
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 1597
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1599
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "totalviews"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 1600
a=0;//     const-string v6, "totalviews"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setTotalviews(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1602
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "imagefname"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 1603
a=0;//     const-string v6, "imagefname"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setImagefnameUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1605
a=0;//     :cond_5
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "author"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     .line 1606
a=0;//     const-string v6, "author"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1608
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "sort_title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 1609
a=0;//     const-string v6, "sort_title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setSort(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1611
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "finishflag"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     .line 1612
a=0;//     const-string v6, "finishflag"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/LikeMoreBookBean;->setIs_vip(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1614
a=0;//     :cond_8
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1590
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static jsonToNoticeCheck(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/NoticeCheck;
a=0;//     .locals 7
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1630
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 1631
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1654
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Lcom/twocloo/com/cn/beans/NoticeCheck;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 1633
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v2, Lcom/twocloo/com/cn/beans/NoticeCheck;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/beans/NoticeCheck;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/beans/NoticeCheck;-><init>()V
a=0;// 
a=0;//     .line 1634
a=0;//     .local v2, "noticeCheck":Lcom/twocloo/com/cn/beans/NoticeCheck;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/NoticeCheck;);
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 1635
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1636
a=0;//     .local v0, "aid":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v0}, Lcom/twocloo/com/cn/beans/NoticeCheck;->setAid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1638
a=0;//     .end local v0    # "aid":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);
a=0;//     const-string v6, "sign"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 1639
a=0;//     const-string v6, "sign"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1640
a=0;//     .local v4, "sign":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lcom/twocloo/com/cn/beans/NoticeCheck;->setSign(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1642
a=0;//     .end local v4    # "sign":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     const-string v6, "url"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 1643
a=0;//     const-string v6, "url"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1644
a=0;//     .local v3, "noticeurl":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloo/com/cn/beans/NoticeCheck;->setUrl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1646
a=0;//     .end local v3    # "noticeurl":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v6=(Conflicted);
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 1647
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1648
a=0;//     .local v5, "title":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v5}, Lcom/twocloo/com/cn/beans/NoticeCheck;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1650
a=0;//     .end local v5    # "title":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     const-string v6, "is_sign"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 1651
a=0;//     const-string v6, "is_sign"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1652
a=0;//     .local v1, "is_sign":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v1}, Lcom/twocloo/com/cn/beans/NoticeCheck;->setIs_sign(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static jsonToOtherbook(Lorg/json/JSONObject;)Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;//     .locals 7
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1514
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 1515
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1569
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Lcom/twocloo/com/cn/beans/OtherBookInfo;);v6=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 1517
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 1518
a=0;//     .local v3, "list":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/twocloo/com/cn/beans/OtherBook;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v5, Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/beans/OtherBookInfo;);
a=0;//     invoke-direct {v5}, Lcom/twocloo/com/cn/beans/OtherBookInfo;-><init>()V
a=0;// 
a=0;//     .line 1519
a=0;//     .local v5, "obi":Lcom/twocloo/com/cn/beans/OtherBookInfo;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/beans/OtherBookInfo;);
a=0;//     const-string v6, "code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 1520
a=0;//     const-string v6, "code"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/OtherBookInfo;->setCode(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1522
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "page"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 1523
a=0;//     const-string v6, "page"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/OtherBookInfo;->setPage(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1525
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "max_page"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 1526
a=0;//     const-string v6, "max_page"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/OtherBookInfo;->setMaxPage(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1528
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "total"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_4
a=0;// 
a=0;//     .line 1529
a=0;//     const-string v6, "total"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Lcom/twocloo/com/cn/beans/OtherBookInfo;->setTotal(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1531
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 1532
a=0;//     const-string v6, "info"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1533
a=0;//     .local v1, "ja":Lorg/json/JSONArray;
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 1534
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-lt v0, v6, :cond_6
a=0;// 
a=0;//     .line 1568
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "ja":Lorg/json/JSONArray;
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v5, v3}, Lcom/twocloo/com/cn/beans/OtherBookInfo;->setAllbookList(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1535
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "ja":Lorg/json/JSONArray;
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Reference,Lorg/json/JSONArray;);v6=(Integer);
a=0;//     new-instance v4, Lcom/twocloo/com/cn/beans/OtherBook;
a=0;// 
a=0;//     #v4=(UninitRef,Lcom/twocloo/com/cn/beans/OtherBook;);
a=0;//     invoke-direct {v4}, Lcom/twocloo/com/cn/beans/OtherBook;-><init>()V
a=0;// 
a=0;//     .line 1536
a=0;//     .local v4, "ob":Lcom/twocloo/com/cn/beans/OtherBook;
a=0;//     #v4=(Reference,Lcom/twocloo/com/cn/beans/OtherBook;);
a=0;//     invoke-virtual {v1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1537
a=0;//     .local v2, "jo":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_7
a=0;// 
a=0;//     .line 1538
a=0;//     const-string v6, "articleid"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setAid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1540
a=0;//     :cond_7
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_8
a=0;// 
a=0;//     .line 1541
a=0;//     const-string v6, "title"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1543
a=0;//     :cond_8
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "author"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_9
a=0;// 
a=0;//     .line 1544
a=0;//     const-string v6, "author"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1546
a=0;//     :cond_9
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "imagefname"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_a
a=0;// 
a=0;//     .line 1547
a=0;//     const-string v6, "imagefname"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setImagefileurl(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1549
a=0;//     :cond_a
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "description"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_b
a=0;// 
a=0;//     .line 1550
a=0;//     const-string v6, "description"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setDescription(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1552
a=0;//     :cond_b
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "finishflag"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_c
a=0;// 
a=0;//     .line 1553
a=0;//     const-string v6, "finishflag"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setFinishflag(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1555
a=0;//     :cond_c
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "is_vip"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_d
a=0;// 
a=0;//     .line 1556
a=0;//     const-string v6, "is_vip"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setIsvip(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1558
a=0;//     :cond_d
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "totalviews"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_e
a=0;// 
a=0;//     .line 1559
a=0;//     const-string v6, "totalviews"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setTotalview(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1561
a=0;//     :cond_e
a=0;//     #v6=(Conflicted);
a=0;//     const-string v6, "wordtotal"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_f
a=0;// 
a=0;//     .line 1562
a=0;//     const-string v6, "wordtotal"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Lcom/twocloo/com/cn/beans/OtherBook;->setTotalwords(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1564
a=0;//     :cond_f
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1534
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static jsonToRechargeChannel(Ljava/lang/String;)Lcom/twocloo/com/cn/beans/RechargeChannelBean;
a=0;//     .locals 5
a=0;//     .param p0, "result"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1674
a=0;//     new-instance v3, Lcom/twocloo/com/cn/beans/RechargeChannelBean;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/beans/RechargeChannelBean;);
a=0;//     invoke-direct {v3}, Lcom/twocloo/com/cn/beans/RechargeChannelBean;-><init>()V
a=0;// 
a=0;//     .line 1676
a=0;//     .local v3, "rechargebean":Lcom/twocloo/com/cn/beans/RechargeChannelBean;
a=0;//     :try_start_0
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/beans/RechargeChannelBean;);
a=0;//     new-instance v1, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1677
a=0;//     .local v1, "jo":Lorg/json/JSONObject;
a=0;//     #v1=(Reference,Lorg/json/JSONObject;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1678
a=0;//     .local v2, "job":Lorg/json/JSONObject;
a=0;//     #v2=(Null);
a=0;//     const-string v4, "alipay"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 1679
a=0;//     const-string v4, "alipay"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1680
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 1681
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/beans/RechargeChannelBean;->setAlipay(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1684
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const-string v4, "sms"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1685
a=0;//     const-string v4, "sms"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 1686
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1687
a=0;//     const-string v4, "title"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Lcom/twocloo/com/cn/beans/RechargeChannelBean;->setSms(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1694
a=0;//     .end local v1    # "jo":Lorg/json/JSONObject;
a=0;//     .end local v2    # "job":Lorg/json/JSONObject;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 1690
a=0;//     :catch_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 1691
a=0;//     .local v0, "e":Lorg/json/JSONException;
a=0;//     #v0=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static jsonToVip(Lorg/json/JSONObject;)Ljava/util/Vector;
a=0;//     .locals 8
a=0;//     .param p0, "json"    # Lorg/json/JSONObject;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/json/JSONObject;",
a=0;//             ")",
a=0;//             "Ljava/util/Vector",
a=0;//             "<",
a=0;//             "Lcom/twocloo/com/cn/beans/BFBook;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1432
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 1479
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Vector;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1435
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     new-instance v0, Ljava/util/Vector;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/Vector;);
a=0;//     invoke-direct {v0}, Ljava/util/Vector;-><init>()V
a=0;// 
a=0;//     .line 1437
a=0;//     .local v0, "al":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/twocloo/com/cn/beans/BFBook;>;"
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_c
a=0;// 
a=0;//     .line 1438
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/base/util/StringUtils;->isBlank(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 1439
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1441
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/Vector;);
a=0;//     const-string v7, "root"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1442
a=0;//     .local v1, "array":Lorg/json/JSONArray;
a=0;//     #v1=(Reference,Lorg/json/JSONArray;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v4=(Integer);v5=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_0
a=0;// 
a=0;//     .line 1443
a=0;//     new-instance v2, Lcom/twocloo/com/cn/beans/BFBook;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/com/cn/beans/BFBook;-><init>()V
a=0;// 
a=0;//     .line 1444
a=0;//     .local v2, "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/beans/BFBook;);
a=0;//     invoke-virtual {v1, v4}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 1445
a=0;//     .local v5, "jobj":Lorg/json/JSONObject;
a=0;//     const-string v7, "wordtotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_3
a=0;// 
a=0;//     .line 1446
a=0;//     const-string v7, "wordtotal"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setWordtotal(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1448
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "last_text_time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 1449
a=0;//     const-string v7, "last_text_time"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setLast_text_time(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1451
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "totalviews"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 1452
a=0;//     const-string v7, "totalviews"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setTotalviews(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1454
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_6
a=0;// 
a=0;//     .line 1455
a=0;//     const-string v7, "articleid"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setArticleid(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1457
a=0;//     :cond_6
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_7
a=0;// 
a=0;//     .line 1458
a=0;//     const-string v7, "title"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setTitle(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1460
a=0;//     :cond_7
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_8
a=0;// 
a=0;//     .line 1461
a=0;//     const-string v7, "author"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setAuthor(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1463
a=0;//     :cond_8
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "imagefname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_9
a=0;// 
a=0;//     .line 1464
a=0;//     const-string v7, "imagefname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setImagefname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1466
a=0;//     :cond_9
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_a
a=0;// 
a=0;//     .line 1467
a=0;//     const-string v7, "finishflag"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setFinishFlag(I)V
a=0;// 
a=0;//     .line 1469
a=0;//     :cond_a
a=0;//     const-string v7, "sortname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_b
a=0;// 
a=0;//     .line 1470
a=0;//     const-string v7, "sortname"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v2, v7}, Lcom/twocloo/com/cn/beans/BFBook;->setSortname(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 1472
a=0;//     :cond_b
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v0, v2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1442
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1476
a=0;//     .end local v1    # "array":Lorg/json/JSONArray;
a=0;//     .end local v2    # "book":Lcom/twocloo/com/cn/beans/BFBook;
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "jobj":Lorg/json/JSONObject;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 1477
a=0;//     .local v3, "e":Ljava/lang/Exception;
a=0;//     #v3=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v3}, Lcom/twocloo/base/util/LogUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     .end local v3    # "e":Ljava/lang/Exception;
a=0;//     :cond_c
a=0;//     #v3=(Conflicted);v7=(Conflicted);
a=0;//     move-object v0, v6
a=0;// 
a=0;//     .line 1479
a=0;//     #v0=(Null);
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
