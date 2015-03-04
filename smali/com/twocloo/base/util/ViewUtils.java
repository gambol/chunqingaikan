package com.twocloo.base.util; class ViewUtils { void a() { int a;
a=0;// .class public Lcom/twocloo/base/util/ViewUtils;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewUtils.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/util/ViewUtils;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static confirm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "ensure"    # Ljava/lang/String;
a=0;//     .param p3, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v0, p2, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 82
a=0;//     sget v1, Lcom/twocloo/base/R$string;->cacel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 83
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static confirm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;//     .param p4, "nl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 64
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 65
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 66
a=0;//     sget v1, Lcom/twocloo/base/R$string;->ensure:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 67
a=0;//     sget v1, Lcom/twocloo/base/R$string;->cacel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 68
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 69
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static confirm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "ensure"    # Ljava/lang/String;
a=0;//     .param p3, "cacel"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;//     .param p5, "nl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {v0, p2, p4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {v0, p3, p5}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 98
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 99
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static confirm(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "positiveMsg"    # Ljava/lang/String;
a=0;//     .param p4, "negativeMsg"    # Ljava/lang/String;
a=0;//     .param p5, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;//     .param p6, "nl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 42
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 43
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 44
a=0;//     invoke-virtual {v0, p3, p5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 45
a=0;//     invoke-virtual {v0, p4, p6}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 46
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 47
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static confirm2(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "title"    # Ljava/lang/String;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;//     .param p4, "nl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 130
a=0;//     sget v1, Lcom/twocloo/base/R$string;->ensure:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 131
a=0;//     sget v1, Lcom/twocloo/base/R$string;->cacel:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 132
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setInverseBackgroundForced(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 133
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static confirmOnUi(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "ensure"    # Ljava/lang/String;
a=0;//     .param p3, "cacel"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;//     .param p5, "nl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     new-instance v0, Lcom/twocloo/base/util/ViewUtils$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/util/ViewUtils$1;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/DialogInterface$OnClickListener;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/DialogInterface$OnClickListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/base/util/ViewUtils$1;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/util/ViewUtils$1;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static custom(Landroid/content/Context;I)Landroid/app/Dialog;
a=0;//     .locals 2
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "layoutResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     new-instance v0, Landroid/app/Dialog;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/Dialog;);
a=0;//     sget v1, Lcom/twocloo/base/R$style;->Theme_FullHeightDialog:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 301
a=0;//     .local v0, "dialog":Landroid/app/Dialog;
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(I)V
a=0;// 
a=0;//     .line 303
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static customDialogCfm(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;//     .locals 8
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "layoutResId"    # I
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/view/View$OnClickListener;
a=0;//     .param p5, "nl"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/base/util/ViewUtils;->custom(Landroid/content/Context;I)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 321
a=0;//     .local v1, "dialog":Landroid/app/Dialog;
a=0;//     #v1=(Reference,Landroid/app/Dialog;);
a=0;//     sget v7, Lcom/twocloo/base/R$id;->dialog_confirm_ensure:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v1, v7}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 322
a=0;//     .local v2, "ensure":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     sget v7, Lcom/twocloo/base/R$id;->dialog_confirm_cacel:I
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 324
a=0;//     .local v0, "cacel":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 325
a=0;//     invoke-virtual {v2, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 327
a=0;//     :cond_0
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {v0, p5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 330
a=0;//     :cond_1
a=0;//     sget v7, Lcom/twocloo/base/R$id;->dialog_confirm_titel:I
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 331
a=0;//     .local v6, "titleV":Landroid/view/View;
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     sget v7, Lcom/twocloo/base/R$id;->dialog_confirm_msg:I
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 333
a=0;//     .local v4, "msgV":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     move-object v5, v6
a=0;// 
a=0;//     .line 334
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 335
a=0;//     .local v5, "titleTV":Landroid/widget/TextView;
a=0;//     invoke-virtual {v5, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 338
a=0;//     .end local v5    # "titleTV":Landroid/widget/TextView;
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 339
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 340
a=0;//     .local v3, "msgTV":Landroid/widget/TextView;
a=0;//     invoke-virtual {v3, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 343
a=0;//     .end local v3    # "msgTV":Landroid/widget/TextView;
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     if-nez p4, :cond_4
a=0;// 
a=0;//     .line 344
a=0;//     new-instance v7, Lcom/twocloo/base/util/ViewUtils$4;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/base/util/ViewUtils$4;);
a=0;//     invoke-direct {v7, v1}, Lcom/twocloo/base/util/ViewUtils$4;-><init>(Landroid/app/Dialog;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/util/ViewUtils$4;);
a=0;//     invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 353
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     if-nez p5, :cond_5
a=0;// 
a=0;//     .line 354
a=0;//     new-instance v7, Lcom/twocloo/base/util/ViewUtils$5;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/twocloo/base/util/ViewUtils$5;);
a=0;//     invoke-direct {v7, v1}, Lcom/twocloo/base/util/ViewUtils$5;-><init>(Landroid/app/Dialog;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/twocloo/base/util/ViewUtils$5;);
a=0;//     invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 363
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     .line 365
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public static customDialogCfmOnUI(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "layoutResId"    # I
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/view/View$OnClickListener;
a=0;//     .param p5, "nl"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     new-instance v0, Lcom/twocloo/base/util/ViewUtils$8;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/util/ViewUtils$8;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-direct/range {v0 .. v6}, Lcom/twocloo/base/util/ViewUtils$8;-><init>(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/util/ViewUtils$8;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 442
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static customDialogInfo(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;
a=0;//     .locals 7
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "layoutResId"    # I
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 380
a=0;//     invoke-static {p0, p1}, Lcom/twocloo/base/util/ViewUtils;->custom(Landroid/content/Context;I)Landroid/app/Dialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 382
a=0;//     .local v0, "dialog":Landroid/app/Dialog;
a=0;//     #v0=(Reference,Landroid/app/Dialog;);
a=0;//     sget v6, Lcom/twocloo/base/R$id;->dialog_confirm_ensure:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 384
a=0;//     .local v1, "ensure":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 385
a=0;//     invoke-virtual {v1, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 387
a=0;//     :cond_0
a=0;//     sget v6, Lcom/twocloo/base/R$id;->dialog_confirm_titel:I
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 388
a=0;//     .local v5, "titleV":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     sget v6, Lcom/twocloo/base/R$id;->dialog_confirm_msg:I
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 390
a=0;//     .local v3, "msgV":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 391
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     check-cast v4, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 392
a=0;//     .local v4, "titleTV":Landroid/widget/TextView;
a=0;//     invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 395
a=0;//     .end local v4    # "titleTV":Landroid/widget/TextView;
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 396
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 397
a=0;//     .local v2, "msgTV":Landroid/widget/TextView;
a=0;//     invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 400
a=0;//     .end local v2    # "msgTV":Landroid/widget/TextView;
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     if-nez p4, :cond_3
a=0;// 
a=0;//     .line 401
a=0;//     new-instance v6, Lcom/twocloo/base/util/ViewUtils$6;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/twocloo/base/util/ViewUtils$6;);
a=0;//     invoke-direct {v6, v0}, Lcom/twocloo/base/util/ViewUtils$6;-><init>(Landroid/app/Dialog;)V
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/base/util/ViewUtils$6;);
a=0;//     invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 409
a=0;//     :cond_3
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/app/Dialog;->show()V
a=0;// 
a=0;//     .line 411
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static customDialogInfoOnUI(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
a=0;//     .locals 6
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "layoutResId"    # I
a=0;//     .param p2, "title"    # Ljava/lang/String;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "pl"    # Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     new-instance v0, Lcom/twocloo/base/util/ViewUtils$7;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/util/ViewUtils$7;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Activity;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/twocloo/base/util/ViewUtils$7;-><init>(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/util/ViewUtils$7;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 427
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static progressLoading(Landroid/content/Context;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 145
a=0;//     sget v0, Lcom/twocloo/base/R$string;->common_loading_msg:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static progressLoading(Landroid/content/Context;Ljava/lang/String;)Landroid/app/ProgressDialog;
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/content/Context;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloo/base/util/ViewUtils;->progressLoading(Landroid/content/Context;Ljava/lang/String;Z)Landroid/app/ProgressDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/ProgressDialog;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static progressLoading(Landroid/content/Context;Ljava/lang/String;Z)Landroid/app/ProgressDialog;
a=0;//     .locals 8
a=0;//     .param p0, "act"    # Landroid/content/Context;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "canCacel"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 166
a=0;//     #v6=(Null);
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 212
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/app/ProgressDialog;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);
a=0;//     new-instance v1, Landroid/app/ProgressDialog;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/ProgressDialog;);
a=0;//     sget v7, Lcom/twocloo/base/R$style;->CustomProgressDialog:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {v1, p0, v7}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 171
a=0;//     .local v1, "customProgressDialog":Landroid/app/ProgressDialog;
a=0;//     #v1=(Reference,Landroid/app/ProgressDialog;);
a=0;//     invoke-virtual {v1, p2}, Landroid/app/ProgressDialog;->setCancelable(Z)V
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->show()V
a=0;// 
a=0;//     .line 173
a=0;//     sget v7, Lcom/twocloo/base/R$layout;->customprogressdialog:I
a=0;// 
a=0;//     invoke-static {p0, v7, v6}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 174
a=0;//     .local v5, "view":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v5}, Landroid/app/ProgressDialog;->setContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 175
a=0;//     sget v6, Lcom/twocloo/base/R$id;->id_tv_loadingmsg:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/widget/TextView;
a=0;// 
a=0;//     .line 176
a=0;//     .local v2, "id_tv_loadingms":Landroid/widget/TextView;
a=0;//     invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 177
a=0;//     const/high16 v6, 0x41900000    # 18.0f
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextSize(F)V
a=0;// 
a=0;//     .line 178
a=0;//     sget v6, Lcom/twocloo/base/R$id;->loadingImageView:I
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v0, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     .line 179
a=0;//     .local v0, "animationDrawable":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V
a=0;// 
a=0;//     .line 180
a=0;//     invoke-virtual {v1}, Landroid/app/ProgressDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 181
a=0;//     .local v4, "mWindow":Landroid/view/Window;
a=0;//     #v4=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 182
a=0;//     .local v3, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v3=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput v6, v3, Landroid/view/WindowManager$LayoutParams;->dimAmount:F
a=0;// 
a=0;//     .line 183
a=0;//     invoke-virtual {v4, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
a=0;// 
a=0;//     .line 184
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Landroid/app/ProgressDialog;->setCanceledOnTouchOutside(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static showDialog(Landroid/content/Context;Ljava/lang/String;ILandroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "icon"    # I
a=0;//     .param p3, "ensureListener"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 260
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 261
a=0;//     const-string v1, "\u6e29\u99a8\u63d0\u793a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 263
a=0;//     sget v1, Lcom/twocloo/base/R$string;->ensure:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 264
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 265
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 2
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "strTitle"    # Ljava/lang/String;
a=0;//     .param p2, "strText"    # Ljava/lang/String;
a=0;//     .param p3, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 275
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 272
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 273
a=0;//     const-string v1, "\u786e\u5b9a"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static showDialogOnUi(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "strTitle"    # Ljava/lang/String;
a=0;//     .param p2, "strText"    # Ljava/lang/String;
a=0;//     .param p3, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     new-instance v0, Lcom/twocloo/base/util/ViewUtils$3;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/util/ViewUtils$3;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Lcom/twocloo/base/util/ViewUtils$3;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/util/ViewUtils$3;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static showDialogSuccess(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;I)V
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "strTitle"    # Ljava/lang/String;
a=0;//     .param p2, "strText"    # Ljava/lang/String;
a=0;//     .param p3, "pl"    # Landroid/content/DialogInterface$OnClickListener;
a=0;//     .param p4, "tyep"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 281
a=0;//     .local v0, "tDialog":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 282
a=0;//     invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 283
a=0;//     const-string v1, "\u8fd4\u56de\u9605\u8bfb"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 284
a=0;//     const-string v1, "\u53bb\u4e66\u57ce\u901b\u901b"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 285
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static toRoundCorner(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
a=0;//     .locals 11
a=0;//     .param p0, "bitmap"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "pixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 454
a=0;//     #v10=(Null);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sget-object v9, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Bitmap$Config;);
a=0;//     invoke-static {v7, v8, v9}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 455
a=0;//     .local v2, "output":Landroid/graphics/Bitmap;
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     new-instance v0, Landroid/graphics/Canvas;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Canvas;);
a=0;//     invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V
a=0;// 
a=0;//     .line 457
a=0;//     .local v0, "canvas":Landroid/graphics/Canvas;
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     const v1, -0xbdbdbe
a=0;// 
a=0;//     .line 458
a=0;//     .local v1, "color":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v3, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     .line 459
a=0;//     .local v3, "paint":Landroid/graphics/Paint;
a=0;//     #v3=(Reference,Landroid/graphics/Paint;);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-direct {v4, v10, v10, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     .line 460
a=0;//     .local v4, "rect":Landroid/graphics/Rect;
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     new-instance v5, Landroid/graphics/RectF;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/RectF;);
a=0;//     invoke-direct {v5, v4}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 461
a=0;//     .local v5, "rectF":Landroid/graphics/RectF;
a=0;//     #v5=(Reference,Landroid/graphics/RectF;);
a=0;//     int-to-float v6, p1
a=0;// 
a=0;//     .line 463
a=0;//     .local v6, "roundPx":F
a=0;//     #v6=(Float);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V
a=0;// 
a=0;//     .line 464
a=0;//     invoke-virtual {v0, v10, v10, v10, v10}, Landroid/graphics/Canvas;->drawARGB(IIII)V
a=0;// 
a=0;//     .line 465
a=0;//     const v7, -0xbdbdbe
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 466
a=0;//     invoke-virtual {v0, v5, v6, v6, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 468
a=0;//     new-instance v7, Landroid/graphics/PorterDuffXfermode;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/PorterDuffXfermode;);
a=0;//     sget-object v8, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/PorterDuff$Mode;);
a=0;//     invoke-direct {v7, v8}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/PorterDuffXfermode;);
a=0;//     invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {v0, p0, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 471
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public static toastDialog(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "duration"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static toastLong(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloo/base/util/ViewUtils;->toastDialog(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static toastOnUI(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "duration"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 240
a=0;//     new-instance v0, Lcom/twocloo/base/util/ViewUtils$2;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/util/ViewUtils$2;);
a=0;//     invoke-direct {v0, p0, p1, p2}, Lcom/twocloo/base/util/ViewUtils$2;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/util/ViewUtils$2;);
a=0;//     invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 247
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static toastShart(Landroid/app/Activity;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0, p1, v0}, Lcom/twocloo/base/util/ViewUtils;->toastDialog(Landroid/app/Activity;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
}}
