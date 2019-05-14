package rvm;
import java.lang.RuntimeException;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.*;
import java.lang.ref.*;
import com.runtimeverification.rvmonitor.java.rt.*;
import com.runtimeverification.rvmonitor.java.rt.ref.*;
import com.runtimeverification.rvmonitor.java.rt.table.*;
import com.runtimeverification.rvmonitor.java.rt.tablebase.AbstractIndexingTree;
import com.runtimeverification.rvmonitor.java.rt.tablebase.SetEventDelegator;
import com.runtimeverification.rvmonitor.java.rt.tablebase.TableAdopter.Tuple2;
import com.runtimeverification.rvmonitor.java.rt.tablebase.TableAdopter.Tuple3;
import com.runtimeverification.rvmonitor.java.rt.tablebase.IDisableHolder;
import com.runtimeverification.rvmonitor.java.rt.tablebase.IMonitor;
import com.runtimeverification.rvmonitor.java.rt.tablebase.DisableHolder;
import com.runtimeverification.rvmonitor.java.rt.tablebase.TerminatedMonitorCleaner;
import java.util.concurrent.atomic.AtomicInteger;

final class P30Monitor_Set extends com.runtimeverification.rvmonitor.java.rt.tablebase.AbstractMonitorSet<P30Monitor> {

	P30Monitor_Set(){
		this.size = 0;
		this.elements = new P30Monitor[4];
	}
	final void event_p(Vector v) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			P30Monitor monitor = this.elements[i];
			if(!monitor.isTerminated()){
				elements[numAlive] = monitor;
				numAlive++;

				final P30Monitor monitorfinalMonitor = monitor;
				monitor.Prop_1_event_p(v);
				if(monitorfinalMonitor.Prop_1_Category_violation) {
					monitorfinalMonitor.Prop_1_handler_violation();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elements[i] = null;
		}
		size = numAlive;
	}
	final void event_q(Vector v) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			P30Monitor monitor = this.elements[i];
			if(!monitor.isTerminated()){
				elements[numAlive] = monitor;
				numAlive++;

				final P30Monitor monitorfinalMonitor = monitor;
				monitor.Prop_1_event_q(v);
				if(monitorfinalMonitor.Prop_1_Category_violation) {
					monitorfinalMonitor.Prop_1_handler_violation();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elements[i] = null;
		}
		size = numAlive;
	}
	final void event_r(Vector v) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			P30Monitor monitor = this.elements[i];
			if(!monitor.isTerminated()){
				elements[numAlive] = monitor;
				numAlive++;

				final P30Monitor monitorfinalMonitor = monitor;
				monitor.Prop_1_event_r(v);
				if(monitorfinalMonitor.Prop_1_Category_violation) {
					monitorfinalMonitor.Prop_1_handler_violation();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elements[i] = null;
		}
		size = numAlive;
	}
	final void event_s(Vector v) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			P30Monitor monitor = this.elements[i];
			if(!monitor.isTerminated()){
				elements[numAlive] = monitor;
				numAlive++;

				final P30Monitor monitorfinalMonitor = monitor;
				monitor.Prop_1_event_s(v);
				if(monitorfinalMonitor.Prop_1_Category_violation) {
					monitorfinalMonitor.Prop_1_handler_violation();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elements[i] = null;
		}
		size = numAlive;
	}
	final void event_t(Vector v) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			P30Monitor monitor = this.elements[i];
			if(!monitor.isTerminated()){
				elements[numAlive] = monitor;
				numAlive++;

				final P30Monitor monitorfinalMonitor = monitor;
				monitor.Prop_1_event_t(v);
				if(monitorfinalMonitor.Prop_1_Category_violation) {
					monitorfinalMonitor.Prop_1_handler_violation();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elements[i] = null;
		}
		size = numAlive;
	}
	final void event_z(Vector v) {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			P30Monitor monitor = this.elements[i];
			if(!monitor.isTerminated()){
				elements[numAlive] = monitor;
				numAlive++;

				final P30Monitor monitorfinalMonitor = monitor;
				monitor.Prop_1_event_z(v);
				if(monitorfinalMonitor.Prop_1_Category_violation) {
					monitorfinalMonitor.Prop_1_handler_violation();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elements[i] = null;
		}
		size = numAlive;
	}
}

class P30Monitor extends com.runtimeverification.rvmonitor.java.rt.tablebase.AbstractAtomicMonitor implements Cloneable, com.runtimeverification.rvmonitor.java.rt.RVMObject {
	protected Object clone() {
		try {
			P30Monitor ret = (P30Monitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	static final int Prop_1_transition_p[] = {3, 1, 3, 4, 4};;
	static final int Prop_1_transition_q[] = {0, 1, 2, 4, 4};;
	static final int Prop_1_transition_r[] = {0, 1, 2, 4, 4};;
	static final int Prop_1_transition_s[] = {2, 1, 2, 4, 4};;
	static final int Prop_1_transition_t[] = {0, 1, 1, 4, 4};;
	static final int Prop_1_transition_z[] = {0, 1, 2, 4, 4};;

	volatile boolean Prop_1_Category_violation = false;

	private final AtomicInteger pairValue;

	P30Monitor() {
		this.pairValue = new AtomicInteger(this.calculatePairValue(-1, 0) ) ;

	}

	@Override public final int getState() {
		return this.getState(this.pairValue.get() ) ;
	}
	@Override public final int getLastEvent() {
		return this.getLastEvent(this.pairValue.get() ) ;
	}
	private final int getState(int pairValue) {
		return (pairValue & 7) ;
	}
	private final int getLastEvent(int pairValue) {
		return (pairValue >> 3) ;
	}
	private final int calculatePairValue(int lastEvent, int state) {
		return (((lastEvent + 1) << 3) | state) ;
	}

	private final int handleEvent(int eventId, int[] table) {
		int nextstate;
		while (true) {
			int oldpairvalue = this.pairValue.get() ;
			int oldstate = this.getState(oldpairvalue) ;
			nextstate = table [ oldstate ];
			int nextpairvalue = this.calculatePairValue(eventId, nextstate) ;
			if (this.pairValue.compareAndSet(oldpairvalue, nextpairvalue) ) {
				break;
			}
		}
		return nextstate;
	}

	final boolean Prop_1_event_p(Vector v) {
		{}

		int nextstate = this.handleEvent(0, Prop_1_transition_p) ;
		this.Prop_1_Category_violation = nextstate == 3;

		return true;
	}

	final boolean Prop_1_event_q(Vector v) {
		{}

		int nextstate = this.handleEvent(1, Prop_1_transition_q) ;
		this.Prop_1_Category_violation = nextstate == 3;

		return true;
	}

	final boolean Prop_1_event_r(Vector v) {
		{}

		int nextstate = this.handleEvent(2, Prop_1_transition_r) ;
		this.Prop_1_Category_violation = nextstate == 3;

		return true;
	}

	final boolean Prop_1_event_s(Vector v) {
		{}

		int nextstate = this.handleEvent(3, Prop_1_transition_s) ;
		this.Prop_1_Category_violation = nextstate == 3;

		return true;
	}

	final boolean Prop_1_event_t(Vector v) {
		{}

		int nextstate = this.handleEvent(4, Prop_1_transition_t) ;
		this.Prop_1_Category_violation = nextstate == 3;

		return true;
	}

	final boolean Prop_1_event_z(Vector v) {
		{}

		int nextstate = this.handleEvent(5, Prop_1_transition_z) ;
		this.Prop_1_Category_violation = nextstate == 3;

		return true;
	}

	final void Prop_1_handler_violation (){
		{
			this.reset();
			throw new RuntimeException("violation");
		}

	}

	final void reset() {
		this.pairValue.set(this.calculatePairValue(-1, 0) ) ;

		Prop_1_Category_violation = false;
	}

	// RVMRef_v was suppressed to reduce memory overhead

	//alive_parameters_0 = [Vector v]
	boolean alive_parameters_0 = true;

	@Override
	protected final void terminateInternal(int idnum) {
		int lastEvent = this.getLastEvent();

		switch(idnum){
			case 0:
			alive_parameters_0 = false;
			break;
		}
		switch(lastEvent) {
			case -1:
			return;
			case 0:
			//p
			return;
			case 1:
			//q
			//alive_v
			if(!(alive_parameters_0)){
				RVM_terminated = true;
				return;
			}
			break;

			case 2:
			//r
			//alive_v
			if(!(alive_parameters_0)){
				RVM_terminated = true;
				return;
			}
			break;

			case 3:
			//s
			//alive_v
			if(!(alive_parameters_0)){
				RVM_terminated = true;
				return;
			}
			break;

			case 4:
			//t
			//alive_v
			if(!(alive_parameters_0)){
				RVM_terminated = true;
				return;
			}
			break;

			case 5:
			//z
			//alive_v
			if(!(alive_parameters_0)){
				RVM_terminated = true;
				return;
			}
			break;

		}
		return;
	}

	public static int getNumberOfEvents() {
		return 6;
	}

	public static int getNumberOfStates() {
		return 5;
	}

}

public final class P30RuntimeMonitor implements com.runtimeverification.rvmonitor.java.rt.RVMObject {
	private static com.runtimeverification.rvmonitor.java.rt.map.RVMMapManager P30MapManager;
	static {
		P30MapManager = new com.runtimeverification.rvmonitor.java.rt.map.RVMMapManager();
		P30MapManager.start();
	}

	// Declarations for the Lock
	static final ReentrantLock P30_RVMLock = new ReentrantLock();
	static final Condition P30_RVMLock_cond = P30_RVMLock.newCondition();

	private static boolean P30_activated = false;

	// Declarations for Indexing Trees
	private static Object P30_v_Map_cachekey_v;
	private static P30Monitor P30_v_Map_cachevalue;
	private static final MapOfMonitor<P30Monitor> P30_v_Map = new MapOfMonitor<P30Monitor>(0) ;

	public static int cleanUp() {
		int collected = 0;
		// indexing trees
		collected += P30_v_Map.cleanUpUnnecessaryMappings();
		return collected;
	}

	// Removing terminated monitors from partitioned sets
	static {
		TerminatedMonitorCleaner.start() ;
	}
	// Setting the behavior of the runtime library according to the compile-time option
	static {
		RuntimeOption.enableFineGrainedLock(false) ;
	}

	public static final void pEvent(Vector v) {
		P30_activated = true;
		while (!P30_RVMLock.tryLock()) {
			Thread.yield();
		}

		CachedWeakReference wr_v = null;
		MapOfMonitor<P30Monitor> matchedLastMap = null;
		P30Monitor matchedEntry = null;
		boolean cachehit = false;
		if ((v == P30_v_Map_cachekey_v) ) {
			matchedEntry = P30_v_Map_cachevalue;
			cachehit = true;
		}
		else {
			wr_v = new CachedWeakReference(v) ;
			{
				// FindOrCreateEntry
				MapOfMonitor<P30Monitor> itmdMap = P30_v_Map;
				matchedLastMap = itmdMap;
				P30Monitor node_v = P30_v_Map.getNodeEquivalent(wr_v) ;
				matchedEntry = node_v;
			}
		}
		// D(X) main:1
		if ((matchedEntry == null) ) {
			if ((wr_v == null) ) {
				wr_v = new CachedWeakReference(v) ;
			}
			// D(X) main:4
			P30Monitor created = new P30Monitor() ;
			matchedEntry = created;
			matchedLastMap.putNode(wr_v, created) ;
		}
		// D(X) main:8--9
		final P30Monitor matchedEntryfinalMonitor = matchedEntry;
		matchedEntry.Prop_1_event_p(v);
		if(matchedEntryfinalMonitor.Prop_1_Category_violation) {
			matchedEntryfinalMonitor.Prop_1_handler_violation();
		}

		if ((cachehit == false) ) {
			P30_v_Map_cachekey_v = v;
			P30_v_Map_cachevalue = matchedEntry;
		}

		P30_RVMLock.unlock();
	}

	public static final void qEvent(Vector v) {
		P30_activated = true;
		while (!P30_RVMLock.tryLock()) {
			Thread.yield();
		}

		CachedWeakReference wr_v = null;
		MapOfMonitor<P30Monitor> matchedLastMap = null;
		P30Monitor matchedEntry = null;
		boolean cachehit = false;
		if ((v == P30_v_Map_cachekey_v) ) {
			matchedEntry = P30_v_Map_cachevalue;
			cachehit = true;
		}
		else {
			wr_v = new CachedWeakReference(v) ;
			{
				// FindOrCreateEntry
				MapOfMonitor<P30Monitor> itmdMap = P30_v_Map;
				matchedLastMap = itmdMap;
				P30Monitor node_v = P30_v_Map.getNodeEquivalent(wr_v) ;
				matchedEntry = node_v;
			}
		}
		// D(X) main:1
		if ((matchedEntry == null) ) {
			if ((wr_v == null) ) {
				wr_v = new CachedWeakReference(v) ;
			}
			// D(X) main:4
			P30Monitor created = new P30Monitor() ;
			matchedEntry = created;
			matchedLastMap.putNode(wr_v, created) ;
		}
		// D(X) main:8--9
		final P30Monitor matchedEntryfinalMonitor = matchedEntry;
		matchedEntry.Prop_1_event_q(v);
		if(matchedEntryfinalMonitor.Prop_1_Category_violation) {
			matchedEntryfinalMonitor.Prop_1_handler_violation();
		}

		if ((cachehit == false) ) {
			P30_v_Map_cachekey_v = v;
			P30_v_Map_cachevalue = matchedEntry;
		}

		P30_RVMLock.unlock();
	}

	public static final void rEvent(Vector v) {
		P30_activated = true;
		while (!P30_RVMLock.tryLock()) {
			Thread.yield();
		}

		CachedWeakReference wr_v = null;
		MapOfMonitor<P30Monitor> matchedLastMap = null;
		P30Monitor matchedEntry = null;
		boolean cachehit = false;
		if ((v == P30_v_Map_cachekey_v) ) {
			matchedEntry = P30_v_Map_cachevalue;
			cachehit = true;
		}
		else {
			wr_v = new CachedWeakReference(v) ;
			{
				// FindOrCreateEntry
				MapOfMonitor<P30Monitor> itmdMap = P30_v_Map;
				matchedLastMap = itmdMap;
				P30Monitor node_v = P30_v_Map.getNodeEquivalent(wr_v) ;
				matchedEntry = node_v;
			}
		}
		// D(X) main:1
		if ((matchedEntry == null) ) {
			if ((wr_v == null) ) {
				wr_v = new CachedWeakReference(v) ;
			}
			// D(X) main:4
			P30Monitor created = new P30Monitor() ;
			matchedEntry = created;
			matchedLastMap.putNode(wr_v, created) ;
		}
		// D(X) main:8--9
		final P30Monitor matchedEntryfinalMonitor = matchedEntry;
		matchedEntry.Prop_1_event_r(v);
		if(matchedEntryfinalMonitor.Prop_1_Category_violation) {
			matchedEntryfinalMonitor.Prop_1_handler_violation();
		}

		if ((cachehit == false) ) {
			P30_v_Map_cachekey_v = v;
			P30_v_Map_cachevalue = matchedEntry;
		}

		P30_RVMLock.unlock();
	}

	public static final void sEvent(Vector v) {
		P30_activated = true;
		while (!P30_RVMLock.tryLock()) {
			Thread.yield();
		}

		CachedWeakReference wr_v = null;
		MapOfMonitor<P30Monitor> matchedLastMap = null;
		P30Monitor matchedEntry = null;
		boolean cachehit = false;
		if ((v == P30_v_Map_cachekey_v) ) {
			matchedEntry = P30_v_Map_cachevalue;
			cachehit = true;
		}
		else {
			wr_v = new CachedWeakReference(v) ;
			{
				// FindOrCreateEntry
				MapOfMonitor<P30Monitor> itmdMap = P30_v_Map;
				matchedLastMap = itmdMap;
				P30Monitor node_v = P30_v_Map.getNodeEquivalent(wr_v) ;
				matchedEntry = node_v;
			}
		}
		// D(X) main:1
		if ((matchedEntry == null) ) {
			if ((wr_v == null) ) {
				wr_v = new CachedWeakReference(v) ;
			}
			// D(X) main:4
			P30Monitor created = new P30Monitor() ;
			matchedEntry = created;
			matchedLastMap.putNode(wr_v, created) ;
		}
		// D(X) main:8--9
		final P30Monitor matchedEntryfinalMonitor = matchedEntry;
		matchedEntry.Prop_1_event_s(v);
		if(matchedEntryfinalMonitor.Prop_1_Category_violation) {
			matchedEntryfinalMonitor.Prop_1_handler_violation();
		}

		if ((cachehit == false) ) {
			P30_v_Map_cachekey_v = v;
			P30_v_Map_cachevalue = matchedEntry;
		}

		P30_RVMLock.unlock();
	}

	public static final void tEvent(Vector v) {
		P30_activated = true;
		while (!P30_RVMLock.tryLock()) {
			Thread.yield();
		}

		CachedWeakReference wr_v = null;
		MapOfMonitor<P30Monitor> matchedLastMap = null;
		P30Monitor matchedEntry = null;
		boolean cachehit = false;
		if ((v == P30_v_Map_cachekey_v) ) {
			matchedEntry = P30_v_Map_cachevalue;
			cachehit = true;
		}
		else {
			wr_v = new CachedWeakReference(v) ;
			{
				// FindOrCreateEntry
				MapOfMonitor<P30Monitor> itmdMap = P30_v_Map;
				matchedLastMap = itmdMap;
				P30Monitor node_v = P30_v_Map.getNodeEquivalent(wr_v) ;
				matchedEntry = node_v;
			}
		}
		// D(X) main:1
		if ((matchedEntry == null) ) {
			if ((wr_v == null) ) {
				wr_v = new CachedWeakReference(v) ;
			}
			// D(X) main:4
			P30Monitor created = new P30Monitor() ;
			matchedEntry = created;
			matchedLastMap.putNode(wr_v, created) ;
		}
		// D(X) main:8--9
		final P30Monitor matchedEntryfinalMonitor = matchedEntry;
		matchedEntry.Prop_1_event_t(v);
		if(matchedEntryfinalMonitor.Prop_1_Category_violation) {
			matchedEntryfinalMonitor.Prop_1_handler_violation();
		}

		if ((cachehit == false) ) {
			P30_v_Map_cachekey_v = v;
			P30_v_Map_cachevalue = matchedEntry;
		}

		P30_RVMLock.unlock();
	}

	public static final void zEvent(Vector v) {
		P30_activated = true;
		while (!P30_RVMLock.tryLock()) {
			Thread.yield();
		}

		CachedWeakReference wr_v = null;
		MapOfMonitor<P30Monitor> matchedLastMap = null;
		P30Monitor matchedEntry = null;
		boolean cachehit = false;
		if ((v == P30_v_Map_cachekey_v) ) {
			matchedEntry = P30_v_Map_cachevalue;
			cachehit = true;
		}
		else {
			wr_v = new CachedWeakReference(v) ;
			{
				// FindOrCreateEntry
				MapOfMonitor<P30Monitor> itmdMap = P30_v_Map;
				matchedLastMap = itmdMap;
				P30Monitor node_v = P30_v_Map.getNodeEquivalent(wr_v) ;
				matchedEntry = node_v;
			}
		}
		// D(X) main:1
		if ((matchedEntry == null) ) {
			if ((wr_v == null) ) {
				wr_v = new CachedWeakReference(v) ;
			}
			// D(X) main:4
			P30Monitor created = new P30Monitor() ;
			matchedEntry = created;
			matchedLastMap.putNode(wr_v, created) ;
		}
		// D(X) main:8--9
		final P30Monitor matchedEntryfinalMonitor = matchedEntry;
		matchedEntry.Prop_1_event_z(v);
		if(matchedEntryfinalMonitor.Prop_1_Category_violation) {
			matchedEntryfinalMonitor.Prop_1_handler_violation();
		}

		if ((cachehit == false) ) {
			P30_v_Map_cachekey_v = v;
			P30_v_Map_cachevalue = matchedEntry;
		}

		P30_RVMLock.unlock();
	}

}
