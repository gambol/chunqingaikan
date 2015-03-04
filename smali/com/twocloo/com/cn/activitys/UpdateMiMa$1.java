package com.twocloo.com.cn.activitys; class UpdateMiMa$1 { void a() { int a;
a=0;// .class Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "UpdateMiMa.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     .line 48
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 52
a=0;//     #v3=(One);
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 75
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 54
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa;);
a=0;//     const-string v2, "\u4fee\u6539\u6210\u529f\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 55
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-static {v1, v2}, Lcom/twocloo/com/cn/common/LocalStore;->setUserPwd(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     const-class v2, Lcom/twocloo/com/cn/activitys/MainActivity;
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "i":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     const-string v1, "id"
a=0;// 
a=0;//     sget v2, Lcom/twocloo/com/cn/R$id;->main_usercenter:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     invoke-virtual {v1}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     .end local v0    # "i":Landroid/content/Intent;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa;);
a=0;//     const-string v2, "\u7528\u6237\u540d\u4e0d\u5b58\u5728\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     :pswitch_2
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa;);
a=0;//     const-string v2, "\u60a8\u8f93\u5165\u7684\u539f\u59cb\u5bc6\u7801\u9519\u8bef\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->access$0(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->access$1(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     invoke-static {v1}, Lcom/twocloo/com/cn/activitys/UpdateMiMa;->access$2(Lcom/twocloo/com/cn/activitys/UpdateMiMa;)Landroid/widget/EditText;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 72
a=0;//     :pswitch_3
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     iget-object v1, p0, Lcom/twocloo/com/cn/activitys/UpdateMiMa$1;->this$0:Lcom/twocloo/com/cn/activitys/UpdateMiMa;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloo/com/cn/activitys/UpdateMiMa;);
a=0;//     const-string v2, "\u4fee\u6539\u5bc6\u7801\u5931\u8d25\uff01"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
}}
