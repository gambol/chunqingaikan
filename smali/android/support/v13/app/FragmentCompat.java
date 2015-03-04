package android.support.v13.app; class FragmentCompat { void a() { int a;
a=0;// .class public Landroid/support/v13/app/FragmentCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FragmentCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v13/app/FragmentCompat$ICSMR1FragmentCompatImpl;,
a=0;//         Landroid/support/v13/app/FragmentCompat$ICSFragmentCompatImpl;,
a=0;//         Landroid/support/v13/app/FragmentCompat$BaseFragmentCompatImpl;,
a=0;//         Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xf
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 55
a=0;//     new-instance v0, Landroid/support/v13/app/FragmentCompat$ICSMR1FragmentCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v13/app/FragmentCompat$ICSMR1FragmentCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v13/app/FragmentCompat$ICSMR1FragmentCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v13/app/FragmentCompat$ICSMR1FragmentCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v13/app/FragmentCompat;->IMPL:Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;// 
a=0;//     .line 61
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Landroid/support/v13/app/FragmentCompat$ICSFragmentCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v13/app/FragmentCompat$ICSFragmentCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v13/app/FragmentCompat$ICSFragmentCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v13/app/FragmentCompat$ICSFragmentCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v13/app/FragmentCompat;->IMPL:Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v13/app/FragmentCompat$BaseFragmentCompatImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v13/app/FragmentCompat$BaseFragmentCompatImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v13/app/FragmentCompat$BaseFragmentCompatImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v13/app/FragmentCompat$BaseFragmentCompatImpl;);
a=0;//     sput-object v0, Landroid/support/v13/app/FragmentCompat;->IMPL:Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Landroid/support/v13/app/FragmentCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setMenuVisibility(Landroid/app/Fragment;Z)V
a=0;//     .locals 1
a=0;//     .param p0, "f"    # Landroid/app/Fragment;
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     sget-object v0, Landroid/support/v13/app/FragmentCompat;->IMPL:Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;->setMenuVisibility(Landroid/app/Fragment;Z)V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setUserVisibleHint(Landroid/app/Fragment;Z)V
a=0;//     .locals 1
a=0;//     .param p0, "f"    # Landroid/app/Fragment;
a=0;//     .param p1, "deferStart"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     sget-object v0, Landroid/support/v13/app/FragmentCompat;->IMPL:Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v13/app/FragmentCompat$FragmentCompatImpl;->setUserVisibleHint(Landroid/app/Fragment;Z)V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
}}
