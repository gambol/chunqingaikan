package android.support.v4.app; class FragmentManager { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/app/FragmentManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FragmentManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;,
a=0;//         Landroid/support/v4/app/FragmentManager$BackStackEntry;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final POP_BACK_STACK_INCLUSIVE:I = 0x1
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 114
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentManager;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static enableDebugLogging(Z)V
a=0;//     .locals 0
a=0;//     .param p0, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 334
a=0;//     sput-boolean p0, Landroid/support/v4/app/FragmentManagerImpl;->DEBUG:Z
a=0;// 
a=0;//     .line 335
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract addOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// .end method
a=0;// 
a=0;// .method public abstract dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract executePendingTransactions()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract findFragmentById(I)Landroid/support/v4/app/Fragment;
a=0;// .end method
a=0;// 
a=0;// .method public abstract findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getBackStackEntryAt(I)Landroid/support/v4/app/FragmentManager$BackStackEntry;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getBackStackEntryCount()I
a=0;// .end method
a=0;// 
a=0;// .method public abstract getFragment(Landroid/os/Bundle;Ljava/lang/String;)Landroid/support/v4/app/Fragment;
a=0;// .end method
a=0;// 
a=0;// .method public openTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;//     .locals 1
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public abstract popBackStack()V
a=0;// .end method
a=0;// 
a=0;// .method public abstract popBackStack(II)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract popBackStack(Ljava/lang/String;I)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract popBackStackImmediate()Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract popBackStackImmediate(II)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract popBackStackImmediate(Ljava/lang/String;I)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract putFragment(Landroid/os/Bundle;Ljava/lang/String;Landroid/support/v4/app/Fragment;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract removeOnBackStackChangedListener(Landroid/support/v4/app/FragmentManager$OnBackStackChangedListener;)V
a=0;// .end method
a=0;// 
a=0;// .method public abstract saveFragmentInstanceState(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/Fragment$SavedState;
a=0;// .end method
}}
