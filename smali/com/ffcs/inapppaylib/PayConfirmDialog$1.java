package com.ffcs.inapppaylib; class PayConfirmDialog$1 { void a() { int a;
a=0;// .class Lcom/ffcs/inapppaylib/PayConfirmDialog$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PayConfirmDialog.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/ffcs/inapppaylib/PayHelper$OnValidataListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/ffcs/inapppaylib/PayConfirmDialog;->checkValidata(Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/ffcs/inapppaylib/PayConfirmDialog;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     .line 314
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onValidataFailure(Lcom/ffcs/inapppaylib/bean/response/PayResponse;)V
a=0;//     .locals 4
a=0;//     .param p1, "resp"    # Lcom/ffcs/inapppaylib/bean/response/PayResponse;
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$0(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 328
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     iget-boolean v1, v1, Lcom/ffcs/inapppaylib/PayConfirmDialog;->isPaying:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 329
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const-string v3, "\u652f\u4ed8\u5931\u8d25!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$4(Lcom/ffcs/inapppaylib/PayConfirmDialog;ILjava/lang/String;)V
a=0;// 
a=0;//     .line 332
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     .line 333
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     .line 334
a=0;//     const/16 v1, 0x126
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$5(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
a=0;// 
a=0;//     .line 336
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onValidataSuccess(Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;//     .locals 2
a=0;//     .param p1, "ivalidata"    # Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-static {v0}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$0(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {p1}, Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;->getRes_code()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-boolean v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->isPaying:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 319
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-static {v0, p1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$1(Lcom/ffcs/inapppaylib/PayConfirmDialog;Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;// 
a=0;//     .line 320
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     iget-object v1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$2(Lcom/ffcs/inapppaylib/PayConfirmDialog;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->showView(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$1;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/ffcs/inapppaylib/PayConfirmDialog;->access$3(Lcom/ffcs/inapppaylib/PayConfirmDialog;Lcom/ffcs/inapppaylib/bean/response/IValidatableResponse;)V
a=0;// 
a=0;//     .line 323
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
