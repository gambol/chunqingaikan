package com.twocloo.com.cn.activitys; class MyaccountActivity$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "MyaccountActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;)Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 8
a=0;//     .param p1, "message"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     iget v5, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     packed-switch v5, :pswitch_data_0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// 
a=0;//     .line 72
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\u83b7\u53d6\u4fe1\u606f\u5931\u8d25"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-static {v5, v6, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 77
a=0;//     :pswitch_1
a=0;//     #v5=(Integer);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity;);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$0(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Lcom/twocloo/com/cn/threads/SyncUserInfoThread;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v6, v6, Lcom/twocloo/com/cn/threads/SyncUserInfoThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     invoke-static {v5, v6}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$1(Lcom/twocloo/com/cn/activitys/MyaccountActivity;Lcom/twocloo/com/cn/beans/UserCenterNewbean;)V
a=0;// 
a=0;//     .line 78
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$2(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$3(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$2(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getYuedubi_count()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$4(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$2(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getYuepiao_count()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$5(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$2(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getShuquan_count()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$6(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "_"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "2clooicon.cach"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 86
a=0;//     .local v2, "fileName":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v5, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v3, v5, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 87
a=0;//     .local v3, "iconFile":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->exists()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v5, Ljava/lang/Thread;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v6, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1$1;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/com/cn/activitys/MyaccountActivity$1$1;);
a=0;//     invoke-direct {v6, p0, v2}, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1$1;-><init>(Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;Ljava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity$1$1;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 118
a=0;//     #v5=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     #v5=(Boolean);
a=0;//     invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 122
a=0;//     .local v4, "uri":Landroid/net/Uri;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Landroid/net/Uri;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity;);
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     invoke-virtual {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v4}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static {v5, v6}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 127
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Conflicted);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Lcom/twocloo/com/cn/activitys/MyaccountActivity$1;->this$0:Lcom/twocloo/com/cn/activitys/MyaccountActivity;
a=0;// 
a=0;//     #v5=(Reference,Lcom/twocloo/com/cn/activitys/MyaccountActivity;);
a=0;//     invoke-static {v5}, Lcom/twocloo/com/cn/activitys/MyaccountActivity;->access$8(Lcom/twocloo/com/cn/activitys/MyaccountActivity;)Lcom/twocloo/com/cn/view/CircleImageView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lcom/twocloo/com/cn/view/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 124
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Uninit);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 125
a=0;//     .local v1, "e":Ljava/io/FileNotFoundException;
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     invoke-virtual {v1}, Ljava/io/FileNotFoundException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 70
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
