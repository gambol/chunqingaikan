package com.twocloo.com.cn.activitys; class TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;
a=0;// .super Landroid/os/AsyncTask;
a=0;// .source "TwoYuanPayActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "CheckTwoyuanOrderChapterCountTask"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/os/AsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private dialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     invoke-direct {p0, p1}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;-><init>(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected varargs doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 12
a=0;//     .param p1, "params"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     new-instance v3, Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;);
a=0;//     invoke-direct {v3, v8}, Lcom/twocloo/com/cn/common/PhoneInfo;-><init>(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 164
a=0;//     .local v3, "phone":Lcom/twocloo/com/cn/common/PhoneInfo;
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/common/PhoneInfo;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->apptype:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 165
a=0;//     .local v4, "pt":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v0, "android"
a=0;// 
a=0;//     .line 166
a=0;//     .local v0, "ct":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/twocloo/com/cn/common/PhoneInfo;->getCurrentVersion()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 167
a=0;//     .local v7, "v":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     sget v9, Lcom/twocloo/com/cn/R$string;->channel:I
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 168
a=0;//     .local v5, "srcid":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "http://app.2cloo.com/book-chapter_num_by_price?price=2&pt=%s&ct=%s&v=%s&srcid=%s"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v10, v10, [Ljava/lang/Object;
a=0;// 
a=0;//     #v10=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     aput-object v4, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aput-object v0, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aput-object v7, v10, v11
a=0;// 
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aput-object v5, v10, v11
a=0;// 
a=0;//     invoke-static {v9, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 169
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/utils/CommonUtils;->getPublicArgs(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 171
a=0;//     .local v6, "url":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/http/HttpComm;->sendJSONToServer(Ljava/lang/String;)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 172
a=0;//     .local v2, "job":Lorg/json/JSONObject;
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const-string v8, "1"
a=0;// 
a=0;//     const-string v9, "code"
a=0;// 
a=0;//     invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 173
a=0;//     const-string v8, "chapter_num"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->access$2(I)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 178
a=0;//     .end local v2    # "job":Lorg/json/JSONObject;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v8=(Conflicted);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 175
a=0;//     :catch_0
a=0;//     #v1=(Uninit);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 176
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "result"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->dialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->dialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->dialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 185
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->dialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;);
a=0;//     invoke-static {v0}, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;->access$3(Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;)V
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPreExecute()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->this$0:Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity;);
a=0;//     const-string v1, "\u8f7d\u5165\u4e2d..."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/twocloo/com/cn/activitys/TwoYuanPayActivity$CheckTwoyuanOrderChapterCountTask;->dialog:Landroid/app/ProgressDialog;
a=0;// 
a=0;//     .line 159
a=0;//     return-void
a=0;// .end method
}}
