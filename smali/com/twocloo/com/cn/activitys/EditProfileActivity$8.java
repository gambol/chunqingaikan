package com.twocloo.com.cn.activitys; class EditProfileActivity$8 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EditProfileActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/EditProfileActivity;->savaData()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     .line 593
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 18
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;);
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$5(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 598
a=0;//     .local v2, "nick_name":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$9(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 599
a=0;//     .local v3, "sign":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$13(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 600
a=0;//     .local v5, "xingbie":Ljava/lang/String;
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u7537"
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     .line 601
a=0;//     const-string v5, "1"
a=0;// 
a=0;//     .line 602
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v1, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 607
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v8=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$14(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 608
a=0;//     .local v6, "age":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$15(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/TextView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 609
a=0;//     .local v7, "star":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "\u6469\u7faf\u5ea7"
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_8
a=0;// 
a=0;//     .line 610
a=0;//     const-string v7, "1"
a=0;// 
a=0;//     .line 634
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     new-instance v17, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v17 .. v17}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 635
a=0;//     .local v17, "sBuilder":Ljava/lang/StringBuilder;
a=0;//     #v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 636
a=0;//     .local v4, "mark":Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$19(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 637
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$19(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 638
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$20(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 639
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 642
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$20(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 643
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$20(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 644
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$21(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 645
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 648
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$21(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 649
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$21(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 650
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$22(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 651
a=0;//     const-string v1, ","
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 654
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$22(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_5
a=0;// 
a=0;//     .line 655
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$22(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/widget/Button;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 658
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 660
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v8=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v8}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$27(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Lcom/twocloo/com/cn/beans/User;->getUid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 661
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v9=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v9}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$27(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Lcom/twocloo/com/cn/beans/User;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Lcom/twocloo/com/cn/beans/User;->getToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v10=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v10}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$28(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v11, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v11=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v11}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$29(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v12=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v12}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$30(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 660
a=0;//     #v12=(Integer);
a=0;//     invoke-static/range {v1 .. v12}, Lcom/twocloo/com/cn/http/HttpImpl;->editprofile(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lorg/json/JSONObject;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 662
a=0;//     .local v15, "json":Lorg/json/JSONObject;
a=0;//     #v15=(Reference,Lorg/json/JSONObject;);
a=0;//     if-eqz v15, :cond_14
a=0;// 
a=0;//     .line 664
a=0;//     :try_start_0
a=0;//     const-string v1, "code"
a=0;// 
a=0;//     invoke-virtual {v15, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 665
a=0;//     .local v13, "code":Ljava/lang/String;
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 666
a=0;//     .local v16, "msg":Landroid/os/Message;
a=0;//     #v16=(Reference,Landroid/os/Message;);
a=0;//     const-string v1, "msg"
a=0;// 
a=0;//     invoke-virtual {v15, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 667
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 668
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$3(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 669
a=0;//     const-string v1, "1"
a=0;// 
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_13
a=0;// 
a=0;//     .line 670
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     invoke-static {v1, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;//     :try_end_0
a=0;//     .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 684
a=0;//     .end local v13    # "code":Ljava/lang/String;
a=0;//     .end local v16    # "msg":Landroid/os/Message;
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v8=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 603
a=0;//     .end local v4    # "mark":Ljava/lang/String;
a=0;//     .end local v6    # "age":Ljava/lang/String;
a=0;//     .end local v7    # "star":Ljava/lang/String;
a=0;//     .end local v15    # "json":Lorg/json/JSONObject;
a=0;//     .end local v17    # "sBuilder":Ljava/lang/StringBuilder;
a=0;//     :cond_7
a=0;//     #v1=(Boolean);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
a=0;//     const-string v1, "\u5973"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 604
a=0;//     const-string v5, "2"
a=0;// 
a=0;//     .line 605
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {v1, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 611
a=0;//     .restart local v6    # "age":Ljava/lang/String;
a=0;//     .restart local v7    # "star":Ljava/lang/String;
a=0;//     :cond_8
a=0;//     #v1=(Boolean);v6=(Reference,Ljava/lang/String;);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);
a=0;//     const-string v1, "\u6c34\u74f6\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     .line 612
a=0;//     const-string v7, "2"
a=0;// 
a=0;//     .line 613
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_9
a=0;//     const-string v1, "\u53cc\u9c7c\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_a
a=0;// 
a=0;//     .line 614
a=0;//     const-string v7, "3"
a=0;// 
a=0;//     .line 615
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_a
a=0;//     const-string v1, "\u767d\u7f8a\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_b
a=0;// 
a=0;//     .line 616
a=0;//     const-string v7, "4"
a=0;// 
a=0;//     .line 617
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_b
a=0;//     const-string v1, "\u91d1\u725b\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_c
a=0;// 
a=0;//     .line 618
a=0;//     const-string v7, "5"
a=0;// 
a=0;//     .line 619
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_c
a=0;//     const-string v1, "\u53cc\u5b50\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_d
a=0;// 
a=0;//     .line 620
a=0;//     const-string v7, "6"
a=0;// 
a=0;//     .line 621
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_d
a=0;//     const-string v1, "\u5de8\u87f9\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     .line 622
a=0;//     const-string v7, "7"
a=0;// 
a=0;//     .line 623
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_e
a=0;//     const-string v1, "\u72ee\u5b50\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     .line 624
a=0;//     const-string v7, "8"
a=0;// 
a=0;//     .line 625
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_f
a=0;//     const-string v1, "\u5904\u5973\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_10
a=0;// 
a=0;//     .line 626
a=0;//     const-string v7, "9"
a=0;// 
a=0;//     .line 627
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_10
a=0;//     const-string v1, "\u5929\u79e4\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_11
a=0;// 
a=0;//     .line 628
a=0;//     const-string v7, "10"
a=0;// 
a=0;//     .line 629
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_11
a=0;//     const-string v1, "\u5929\u874e\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_12
a=0;// 
a=0;//     .line 630
a=0;//     const-string v7, "11"
a=0;// 
a=0;//     .line 631
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_12
a=0;//     const-string v1, "\u5c04\u624b\u5ea7"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 632
a=0;//     const-string v7, "12"
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 671
a=0;//     .restart local v4    # "mark":Ljava/lang/String;
a=0;//     .restart local v13    # "code":Ljava/lang/String;
a=0;//     .restart local v15    # "json":Lorg/json/JSONObject;
a=0;//     .restart local v16    # "msg":Landroid/os/Message;
a=0;//     .restart local v17    # "sBuilder":Ljava/lang/StringBuilder;
a=0;//     :cond_13
a=0;//     :try_start_1
a=0;//     #v4=(Reference,Ljava/lang/String;);v8=(Reference,Ljava/lang/String;);v9=(Reference,Ljava/lang/String;);v10=(Integer);v11=(Integer);v12=(Integer);v13=(Reference,Ljava/lang/String;);v15=(Reference,Lorg/json/JSONObject;);v16=(Reference,Landroid/os/Message;);v17=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 672
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-static {v1, v8}, Lcom/twocloo/com/cn/common/LocalStore;->setUserSex(Landroid/content/Context;I)V
a=0;//     :try_end_1
a=0;//     .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 674
a=0;//     .end local v13    # "code":Ljava/lang/String;
a=0;//     .end local v16    # "msg":Landroid/os/Message;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v8=(Conflicted);v13=(Conflicted);v16=(Conflicted);
a=0;//     move-exception v14
a=0;// 
a=0;//     .line 675
a=0;//     .local v14, "e":Lorg/json/JSONException;
a=0;//     #v14=(Reference,Lorg/json/JSONException;);
a=0;//     invoke-virtual {v14}, Lorg/json/JSONException;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 678
a=0;//     .end local v14    # "e":Lorg/json/JSONException;
a=0;//     :cond_14
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/EditProfileActivity;);v8=(Reference,Ljava/lang/String;);v13=(Uninit);v14=(Uninit);v16=(Uninit);
a=0;//     invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 679
a=0;//     .restart local v16    # "msg":Landroid/os/Message;
a=0;//     #v16=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 680
a=0;//     const-string v1, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5\u540e\u91cd\u8bd5\uff01"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 681
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Lcom/twocloo/com/cn/activitys/EditProfileActivity$8;->this$0:Lcom/twocloo/com/cn/activitys/EditProfileActivity;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/EditProfileActivity;->access$3(Lcom/twocloo/com/cn/activitys/EditProfileActivity;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
}}
