package com.twocloo.com.cn.activitys; class EditActivity$2 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/EditActivity$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "EditActivity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/twocloo/com/cn/activitys/EditActivity;->onCreate(Landroid/os/Bundle;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/EditActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     .line 85
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity;);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/activitys/EditActivity;->access$0(Lcom/twocloo/com/cn/activitys/EditActivity;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Landroid/text/Editable;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 90
a=0;//     .local v1, "text":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     new-instance v2, Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v3, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity;);
a=0;//     const-class v4, Lcom/twocloo/com/cn/activitys/AddUserLabelActivity;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Class;);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 92
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v2, "edittext"
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     const/16 v3, 0x3e9
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {v2, v3, v0}, Lcom/twocloo/com/cn/activitys/EditActivity;->setResult(ILandroid/content/Intent;)V
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/common/Util;->closeSoftKeyBoard(Landroid/app/Activity;)V
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/EditActivity;->finish()V
a=0;// 
a=0;//     .line 100
a=0;//     .end local v0    # "intent":Landroid/content/Intent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Lcom/twocloo/com/cn/activitys/EditActivity$2;->this$0:Lcom/twocloo/com/cn/activitys/EditActivity;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/com/cn/activitys/EditActivity;);
a=0;//     invoke-virtual {v2}, Lcom/twocloo/com/cn/activitys/EditActivity;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "\u8f93\u5165\u5185\u5bb9\u4e0d\u80fd\u4e3a\u7a7a"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v2, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
