package com.twocloo.com.cn.fragment; class BookCityFragment$InitToServerTask { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "BookCityFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "InitToServerTask"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/HashMap",
a=0;//         "<",
a=0;//         "Ljava/lang/Integer;",
a=0;//         "Ljava/lang/String;",
a=0;//         ">;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private result:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->doInBackground([Ljava/lang/Object;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs doInBackground([Ljava/lang/Object;)Ljava/util/HashMap;
a=0;//     .locals 18
a=0;//     .param p1, "params"    # [Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;);
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     new-instance v14, Ljava/util/HashMap;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v14}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {v13, v14}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookCityFragment;Ljava/util/HashMap;)V
a=0;// 
a=0;//     .line 134
a=0;//     :try_start_0
a=0;//     const-string v9, "client"
a=0;// 
a=0;//     .line 135
a=0;//     .local v9, "pt":Ljava/lang/String;
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, ""
a=0;// 
a=0;//     .line 136
a=0;//     .local v10, "srcid":Ljava/lang/String;
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "android"
a=0;// 
a=0;//     .line 137
a=0;//     .local v1, "ct":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v12, "1"
a=0;// 
a=0;//     .line 138
a=0;//     .local v12, "v":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "000000000000000"
a=0;// 
a=0;//     .line 139
a=0;//     .local v4, "imei":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     if-eqz v13, :cond_3
a=0;// 
a=0;//     .line 140
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 141
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     sget v14, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 142
a=0;//     new-instance v5, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-direct {v5, v13}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 143
a=0;//     .local v5, "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/common/PhoneInfo;->getImei()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 145
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/common/LocalStore;->getMrnt(Landroid/content/Context;)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 146
a=0;//     .local v7, "nightOrDay":I
a=0;//     #v7=(Integer);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v14, "http://app.2cloo.com/store-dm_index_bar?ct=%s&srcid=%s&v=%s&pt=%s&imei=%s&night=%s"
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     const/4 v15, 0x6
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     new-array v15, v15, [Ljava/lang/Object;
a=0;// 
a=0;//     #v15=(Reference,[Ljava/lang/Object;);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     aput-object v1, v15, v16
a=0;// 
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     #v16=(One);
a=0;//     aput-object v10, v15, v16
a=0;// 
a=0;//     const/16 v16, 0x2
a=0;// 
a=0;//     #v16=(PosByte);
a=0;//     aput-object v12, v15, v16
a=0;// 
a=0;//     const/16 v16, 0x3
a=0;// 
a=0;//     aput-object v9, v15, v16
a=0;// 
a=0;//     const/16 v16, 0x4
a=0;// 
a=0;//     aput-object v4, v15, v16
a=0;// 
a=0;//     const/16 v16, 0x5
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v17, v15, v16
a=0;// 
a=0;//     invoke-static {v14, v15}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v14}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 148
a=0;//     .local v11, "url":Ljava/lang/String;
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 149
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/base/util/NetUtils;->checkNet(Landroid/content/Context;)Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     sget-object v14, Lcom/twocloo/base/common/NetType;->TYPE_NONE:Lcom/twocloo/base/common/NetType;
a=0;// 
a=0;//     if-eq v13, v14, :cond_2
a=0;// 
a=0;//     .line 150
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-static {v11, v13}, Lcom/twocloo/base/http/HttpHelper;->get(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 151
a=0;//     const-string v13, "null"
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-eqz v13, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     #v13=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v13=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-virtual {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v13, v14}, Lcom/twocloo/com/cn/common/LocalStore;->setBookCityTitle(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 157
a=0;//     :cond_1
a=0;//     #v13=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-static {v13, v14}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$3(Lcom/twocloo/com/cn/fragment/BookCityFragment;Z)V
a=0;// 
a=0;//     .line 160
a=0;//     :cond_2
a=0;//     #v13=(Conflicted);v14=(Reference,Ujava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Boolean);
a=0;//     if-nez v13, :cond_3
a=0;// 
a=0;//     .line 161
a=0;//     new-instance v6, Lorg/json/JSONArray;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/json/JSONArray;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v13}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 162
a=0;//     .local v6, "job":Lorg/json/JSONArray;
a=0;//     #v6=(Reference,Lorg/json/JSONArray;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$4(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 163
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);v8=(Conflicted);v16=(Conflicted);
a=0;//     invoke-virtual {v6}, Lorg/json/JSONArray;->length()I
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lt v3, v13, :cond_4
a=0;// 
a=0;//     .line 172
a=0;//     .end local v1    # "ct":Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "imei":Ljava/lang/String;
a=0;//     .end local v5    # "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     .end local v6    # "job":Lorg/json/JSONArray;
a=0;//     .end local v7    # "nightOrDay":I
a=0;//     .end local v9    # "pt":Ljava/lang/String;
a=0;//     .end local v10    # "srcid":Ljava/lang/String;
a=0;//     .end local v11    # "url":Ljava/lang/String;
a=0;//     .end local v12    # "v":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$4(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     return-object v13
a=0;// 
a=0;//     .line 164
a=0;//     .restart local v1    # "ct":Ljava/lang/String;
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v4    # "imei":Ljava/lang/String;
a=0;//     .restart local v5    # "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     .restart local v6    # "job":Lorg/json/JSONArray;
a=0;//     .restart local v7    # "nightOrDay":I
a=0;//     .restart local v9    # "pt":Ljava/lang/String;
a=0;//     .restart local v10    # "srcid":Ljava/lang/String;
a=0;//     .restart local v11    # "url":Ljava/lang/String;
a=0;//     .restart local v12    # "v":Ljava/lang/String;
a=0;//     :cond_4
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Uninit);v3=(Integer);v4=(Reference,Ljava/lang/String;);v5=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);v6=(Reference,Lorg/json/JSONArray;);v7=(Integer);v9=(Reference,Ljava/lang/String;);v10=(Reference,Ljava/lang/String;);v11=(Reference,Ljava/lang/String;);v12=(Reference,Ljava/lang/String;);v13=(Integer);v14=(Reference,Ujava/lang/Object;);v15=(Reference,Ljava/lang/Object;);v17=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v6, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 165
a=0;//     .local v8, "ob":Lorg/json/JSONObject;
a=0;//     #v8=(Reference,Lorg/json/JSONObject;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v13=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v13}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$4(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     new-instance v15, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v15=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "title"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-direct/range {v15 .. v16}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "_"
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     const-string v16, "url"
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     invoke-virtual/range {v15 .. v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v13, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     .line 163
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 169
a=0;//     .end local v1    # "ct":Ljava/lang/String;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "imei":Ljava/lang/String;
a=0;//     .end local v5    # "info":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     .end local v6    # "job":Lorg/json/JSONArray;
a=0;//     .end local v7    # "nightOrDay":I
a=0;//     .end local v8    # "ob":Lorg/json/JSONObject;
a=0;//     .end local v9    # "pt":Ljava/lang/String;
a=0;//     .end local v10    # "srcid":Ljava/lang/String;
a=0;//     .end local v11    # "url":Ljava/lang/String;
a=0;//     .end local v12    # "v":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 170
a=0;//     .local v2, "e":Lorg/json/JSONException;
a=0;//     #v2=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     check-cast p1, Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->onPostExecute(Ljava/util/HashMap;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/util/HashMap;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/Integer;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     .local p1, "result":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/Integer;Ljava/lang/String;>;"
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v1, p1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$2(Lcom/twocloo/com/cn/fragment/BookCityFragment;Ljava/util/HashMap;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$4(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$5(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$6(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     .line 181
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$7(Lcom/twocloo/com/cn/fragment/BookCityFragment;)V
a=0;// 
a=0;//     .line 192
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$8(Lcom/twocloo/com/cn/fragment/BookCityFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->cancel()V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Lcom/twocloo/com/cn/R$string;->network_err:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->makeToast(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 189
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/common/LocalStore;->getValidBookCityTitle(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->result:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/fragment/BookCityFragment$InitToServerTask;->this$0:Lcom/twocloo/com/cn/fragment/BookCityFragment;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/fragment/BookCityFragment;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/com/cn/fragment/BookCityFragment;->access$1(Lcom/twocloo/com/cn/fragment/BookCityFragment;Landroid/app/ProgressDialog;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
