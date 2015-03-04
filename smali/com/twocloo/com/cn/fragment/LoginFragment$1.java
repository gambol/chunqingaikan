package com.twocloo.com.cn.fragment; class LoginFragment$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/fragment/LoginFragment$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "LoginFragment.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/fragment/LoginFragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     .line 118
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$0(Lcom/twocloo/com/cn/fragment/LoginFragment$1;)Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget-object v0, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 10
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 123
a=0;//     #v9=(Null);
a=0;//     iget v7, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sparse-switch v7, :sswitch_data_0
a=0;// 
a=0;//     .line 203
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Ljava/lang/String;);
a=0;//     return-void
a=0;// 
a=0;//     .line 125
a=0;//     :sswitch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);v9=(Null);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$0(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/threads/UserInfoNewThread;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget-object v8, v8, Lcom/twocloo/com/cn/threads/UserInfoNewThread;->userinfo:Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     invoke-static {v7, v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$1(Lcom/twocloo/com/cn/fragment/LoginFragment;Lcom/twocloo/com/cn/beans/UserCenterNewbean;)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$3(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getNickname()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getMobile()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 129
a=0;//     .local v6, "phone":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getEmail()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 130
a=0;//     .local v2, "email":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/16 v8, 0xa
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-gt v7, v8, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     if-gt v7, v8, :cond_2
a=0;// 
a=0;//     .line 131
a=0;//     :cond_1
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$4(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$5(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/widget/ImageView;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 135
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$6(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getYuedubi_count()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\u70b9\u5238  "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$7(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$2(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/UserCenterNewbean;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/UserCenterNewbean;->getShuquan_count()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "\u4e66\u5238  "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 139
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$8(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "_"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "2clooicon.cach"
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 140
a=0;//     .local v3, "fileName":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/io/File;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v4, v7, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 141
a=0;//     .local v4, "iconFile":Ljava/io/File;
a=0;//     #v4=(Reference,Ljava/io/File;);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$9(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "_"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "blurred_image.cach"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v0, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 142
a=0;//     .local v0, "blurredImageFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     sget-object v7, Lcom/twocloo/com/cn/common/Constants;->TWOCLOO_USER_ICON_IMGCACHE:Ljava/lang/String;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget-object v9, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$9(Lcom/twocloo/com/cn/fragment/LoginFragment;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "_"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, "cropimage.cach"
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v1, v7, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 143
a=0;//     .local v1, "cropImgFile":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     new-instance v7, Ljava/lang/Thread;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v8, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;
a=0;// 
a=0;//     #v8=(UninitRef,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;);
a=0;//     invoke-direct {v8, p0, v3}, Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;-><init>(Lcom/twocloo/com/cn/fragment/LoginFragment$1;Ljava/lang/String;)V
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment$1$1;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 175
a=0;//     #v7=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v7}, Ljava/lang/Thread;->start()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 179
a=0;//     .end local v0    # "blurredImageFile":Ljava/io/File;
a=0;//     .end local v1    # "cropImgFile":Ljava/io/File;
a=0;//     .end local v2    # "email":Ljava/lang/String;
a=0;//     .end local v3    # "fileName":Ljava/lang/String;
a=0;//     .end local v4    # "iconFile":Ljava/io/File;
a=0;//     .end local v6    # "phone":Ljava/lang/String;
a=0;//     :sswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);v9=(Null);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u83b7\u53d6\u4fe1\u606f\u5931\u8d25"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 183
a=0;//     :sswitch_2
a=0;//     #v7=(Integer);v8=(Uninit);
a=0;//     sput-boolean v9, Lcom/twocloo/com/cn/activitys/BookApp;->isInit:Z
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$15(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$15(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/ProgressDialog;->isShowing()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 185
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$15(Lcom/twocloo/com/cn/fragment/LoginFragment;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 187
a=0;//     :cond_3
a=0;//     #v7=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     .line 188
a=0;//     const-string v7, "LOGINTAG"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "Readbook"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "ReadbookDown"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "FeedbackActivity"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 189
a=0;//     const-string v7, "BaseReadBook"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "NovelDetailedActivity"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "BfMLActivity"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 190
a=0;//     const-string v7, "RECHARGE"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     const-string v7, "SignInActivity"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     iget-object v8, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/fragment/LoginFragment;->access$16(Lcom/twocloo/com/cn/fragment/LoginFragment;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 191
a=0;//     :cond_4
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/support/v4/app/FragmentActivity;->finish()V
a=0;// 
a=0;//     .line 199
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v7}, Lcom/twocloo/com/cn/common/LocalStore;->getFirstLogin(Landroid/content/Context;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_5
a=0;//     #v5=(Uninit);v7=(Boolean);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/com/cn/fragment/LoginFragment;);
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v8, "\u767b\u5f55\u6210\u529f\uff01"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 195
a=0;//     new-instance v5, Landroid/content/Intent;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-virtual {v7}, Lcom/twocloo/com/cn/fragment/LoginFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-class v8, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     invoke-direct {v5, v7, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 196
a=0;//     .local v5, "intent":Landroid/content/Intent;
a=0;//     #v5=(Reference,Landroid/content/Intent;);
a=0;//     const-string v7, "id"
a=0;// 
a=0;//     sget v8, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v5, v7, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v7, p0, Lcom/twocloo/com/cn/fragment/LoginFragment$1;->this$0:Lcom/twocloo/com/cn/fragment/LoginFragment;
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Lcom/twocloo/com/cn/fragment/LoginFragment;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 123
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x1 -> :sswitch_2
a=0;//         0xa -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
}}
