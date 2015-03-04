package cn.dm.android.f; class c$a$1 { void a() { int a;
a=0;// .class Lcn/dm/android/f/c$a$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/f/c$a;->b(Landroid/content/Context;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic b:Lcn/dm/android/f/c$a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/f/c$a;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     iput-object p1, p0, Lcn/dm/android/f/c$a$1;->b:Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/f/c$a$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/f/c$a$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     .line 787
a=0;//     :try_start_0
a=0;//     #v3=(PosByte);
a=0;//     iget-object v1, p0, Lcn/dm/android/f/c$a$1;->a:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const-string v2, "phone"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 789
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 790
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 793
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getPhoneType()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 796
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 826
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 798
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/telephony/TelephonyManager;);v2=(Integer);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/telephony/CellLocation;);
a=0;//     check-cast v2, Landroid/telephony/gsm/GsmCellLocation;
a=0;// 
a=0;//     .line 800
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 801
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Reference,Landroid/telephony/gsm/GsmCellLocation;);
a=0;//     check-cast v0, Landroid/telephony/gsm/GsmCellLocation;
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     #v3=(Reference,Landroid/telephony/gsm/GsmCellLocation;);
a=0;//     invoke-virtual {v3}, Landroid/telephony/gsm/GsmCellLocation;->getCid()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 803
a=0;//     #v3=(Integer);
a=0;//     check-cast v2, Landroid/telephony/gsm/GsmCellLocation;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/telephony/gsm/GsmCellLocation;->getLac()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 805
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v4, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 808
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     invoke-virtual {v1, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 812
a=0;//     #v1=(Integer);
a=0;//     iget-object v5, p0, Lcn/dm/android/f/c$a$1;->b:Lcn/dm/android/f/c$a;
a=0;// 
a=0;//     #v5=(Reference,Lcn/dm/android/f/c$a;);
a=0;//     invoke-static {v5, v3, v2, v1, v4}, Lcn/dm/android/f/c$a;->a(Lcn/dm/android/f/c$a;IIII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 824
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 796
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
}}
