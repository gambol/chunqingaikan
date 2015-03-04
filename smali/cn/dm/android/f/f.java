package cn.dm.android.f; class f { void a() { int a;
a=0;// .class public Lcn/dm/android/f/f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     instance-of v0, p0, Landroid/app/Activity;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 27
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 28
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     const-string v1, "\u5f53\u524d\u7684\u7f51\u7edc\u72b6\u6001\u4e3a 2G/3G,\u4f1a\u4ea7\u751f\u7f51\u7edc\u6d41\u91cf,\u662f\u5426\u7ee7\u7eed\u4e0b\u8f7d?"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 29
a=0;//     const-string v1, "\u7f51\u7edc\u63d0\u793a"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 30
a=0;//     const-string v1, "\u786e\u8ba4"
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 31
a=0;//     const-string v1, "\u53d6\u6d88"
a=0;// 
a=0;//     new-instance v2, Lcn/dm/android/f/f$1;
a=0;// 
a=0;//     #v2=(UninitRef,Lcn/dm/android/f/f$1;);
a=0;//     invoke-direct {v2}, Lcn/dm/android/f/f$1;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/f/f$1;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
