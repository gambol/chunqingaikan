package com.ffcs.inapppaylib; class PayConfirmDialog$2 { void a() { int a;
a=0;// .class Lcom/ffcs/inapppaylib/PayConfirmDialog$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PayConfirmDialog.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/ffcs/inapppaylib/PayConfirmDialog;->showDialog(ILjava/lang/String;)V
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
a=0;// .field private final synthetic val$type:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/ffcs/inapppaylib/PayConfirmDialog;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     iput p2, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;->val$type:I
a=0;// 
a=0;//     .line 421
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->cancel()V
a=0;// 
a=0;//     .line 425
a=0;//     iget v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;->val$type:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 426
a=0;//     iget-object v0, p0, Lcom/ffcs/inapppaylib/PayConfirmDialog$2;->this$0:Lcom/ffcs/inapppaylib/PayConfirmDialog;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ffcs/inapppaylib/PayConfirmDialog;);
a=0;//     iget-object v0, v0, Lcom/ffcs/inapppaylib/PayConfirmDialog;->dialog:Landroid/app/Dialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
